package lesson1;

public class HomeWork3 {
    public static void main(String[] args) {
    double a = 4;
    double b = 3;
    double c = 5;
    double d = 5.5;

     double s = (a + b + c + d) / 2.0d;
     double area = Math.sqrt((s-a)*(s-b)*(s-c)*(s-d));
        System.out.println(area);
    }
}
