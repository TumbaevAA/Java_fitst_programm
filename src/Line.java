package src;

public class Line {
    private Point startPoint, endPoint;

    Line(){}

    public boolean init(Point start, Point end){
        if (start == null || end == null) return false;
        this.startPoint = start;
        this.endPoint = end;
        return true;
    }

    public boolean input(){
        Point start = new Point(), end = new Point();
        if (start.input() && end.input()) this.init(start,end);
        return false;
    }

    public void output(){
        System.out.print("Start of the line: ");
        this.startPoint.output();
        System.out.print("\nEnd of the line: ");
        this.endPoint.output();

        System.out.printf("\nLength of the line: %f", this.length());
    }

    public float length(){
        return this.startPoint.distance(this.endPoint);
    }

    public boolean isPointOnLine(Point point){
        if (point == null) return false;
        return this.startPoint.distance(this.endPoint) + this.endPoint.distance(this.startPoint) == this.length();
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }
}
