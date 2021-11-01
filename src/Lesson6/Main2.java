package Lesson6;

public class Main2 {
    public static void main(String[] args) {

        Figure triangle = new Figure();
        triangle.setSideA(3);
        triangle.setSideB(6);
        triangle.setSideC(9);

        Figure oval = new Figure();
        oval.setLengthOfBigHalfAxis(6);
        oval.setLengthOfSmallHalfAxis(4);

        Figure circle = new Figure();
        circle.setRadiusOfCircle(7);

        Figure rectangle = new Figure();
        rectangle.setLengthOfRectangle(5);
        rectangle.setWidthOfRectangle(3);
    }
}
