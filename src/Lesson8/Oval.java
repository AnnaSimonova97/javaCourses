package Lesson8;

public class Oval extends CircleShape {
    private double radius2;

    public Oval() {

    }
    public Oval(double radius, double radius2) {
        super(radius);
        this.radius2 = radius2;
    }
    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

}
