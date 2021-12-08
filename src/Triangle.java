package src;

public class Triangle {
    private Point firstPoint, secondPoint, thirdPoint;

    Triangle(){}

    public boolean init(Point first, Point second, Point third){
        if (first == null || second == null || third == null) return false;
        float d1 = first.distance(second), d2 = second.distance(third), d3 = third.distance(first);
        if (d1 == 0 || d2 == 0 || d3 == 0 ||                       //Если какие-то точки совпадают, возвращаем false
                d1 == d2 + d3 || d2 == d1 + d3 || d3 == d1 + d2) { //Если точка лежит на отрезке между двумя другими - false
            return false;
        }

        this.firstPoint = first;
        this.secondPoint = second;
        this.thirdPoint = third;

        return true;
    }

    public boolean input(){
        Point first = new Point(), second = new Point(), third = new Point();
        if (first.input() && second.input() && third.input())
            return this.init(first, second, third);

        return false;
    }

    public void output(){
        System.out.print("Triangle\n----------------------------------------------\n");
        System.out.print("Points\n");

        System.out.print("first");
        this.firstPoint.output();

        System.out.print("\nsecond");
        this.secondPoint.output();

        System.out.print("\nthird");
        this.thirdPoint.output();


        System.out.print("\n\nLine lengths\n");
        System.out.printf("first = %f", this.lineLength(1));
        System.out.printf("\nsecond = %f", this.lineLength(2));
        System.out.printf("\nthird = %f", this.lineLength(3));

        System.out.printf("\n\nPerimeter = %f", this.perimeter());
        System.out.printf("\nArea = %f", this.area());
        System.out.print("\n----------------------------------------------");
    }

    public float lineLength(int lineNumber){
        return switch (lineNumber) {
            case 1 -> this.firstPoint.distance(this.secondPoint);
            case 2 -> this.secondPoint.distance(this.thirdPoint);
            case 3 -> this.thirdPoint.distance(this.firstPoint);
            default -> -1;
        };
    }

    public float perimeter(){
        float perimeter = 0;
        for (int i = 1; i < 4; i++) {
            perimeter += this.lineLength(i);
        }

        return perimeter;
    }

    public float area(){
        float semiPerimeter = this.perimeter() / 2;
        return (float) Math.sqrt(semiPerimeter * (semiPerimeter - this.lineLength(1)) *
                (semiPerimeter - this.lineLength(2) * (semiPerimeter - this.lineLength(3))));
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public Point getThirdPoint() {
        return thirdPoint;
    }
}
