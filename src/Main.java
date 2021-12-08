package src;

public class Main {

    public static void main(String[] args) {

        //Тест point
        Point firstPoint = new Point(0,0), secondPoint = new Point();
        System.out.print("Point test\nEnter the coordinates of the second point: ");
        secondPoint.input();

        System.out.print("\nThe coordinates of the first point: ");
        firstPoint.output();
        System.out.print("\nThe coordinates of the second point: ");
        secondPoint.output();
        System.out.printf("\nDistance between points: %f", firstPoint.distance(secondPoint));

        //Тест Line
        Line line = new Line();
        System.out.print("\n\n\nLine test\nEnter the coordinates of the start and the end of the line: ");
        line.input();

        System.out.print("\nCoordinates of the line");
        line.output();

        //Тест Triangle
        Triangle triangle = new Triangle();
        System.out.print("\n\n\nTriangle test\nEnter the coordinates of the first, the second and the third points: ");
        triangle.input();
        triangle.output();

        //Тест Square
        System.out.print("\n\n\nSquare test\nEnter the coordinates of the first, the second, the third and the fourth points: ");
        Square square = new Square();
        square.input();
        square.output();

        //Тест circle
        Circle circle = new Circle();
        System.out.print("\n\n\nCircle test\nEnter the coordinates of the center and the radius: ");
        circle.input();
        circle.output();
    }

}
