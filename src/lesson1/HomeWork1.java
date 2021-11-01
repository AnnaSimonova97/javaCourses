package lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
        double a = 4.5;
        double b = 3;
        double c = 2;

        double s = (a + b + c) / 2.0d;
        double area =Math.sqrt(s*(s -a)*(s - b)*(s - c));
        System.out.println(area);

    }
}
