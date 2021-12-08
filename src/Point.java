package src;

import java.util.Scanner;

public class Point {
    private float x, y;

    public Point(){}

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public boolean input(){
        float x, y;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextFloat()){
            this.x = scanner.nextFloat();
            if (scanner.hasNextFloat()){
                this.y = scanner.nextFloat();
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public void output(){
        System.out.printf("\nx = %f, y = %f", this.x, this.y);
    }

    public float distance(Point end){
        if (end == null) return -1;

        float d1 = end.x - this.x, d2 = end.y - this.y;
        return (float) Math.sqrt(d1 * d1 + d2 * d2);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
