package lesson4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //считывает с клавиатуры
        System.out.println("Какую фигуру посичтаем?");
        System.out.println("1 - Квадрат");
        System.out.println("2 - Треугольник");
        System.out.println("3 - Круг");
        System.out.println("4 - Овал");
        System.out.println("5 - Параллелограмм");

        String figure = scanner.nextLine();  //взять  то что у пользователя в консоли и отдает текст
        System.out.println("Что посчитать?");
        System.out.println("1 - Площадь");
        System.out.println("2 - Периметр");

        String action = scanner.nextLine();

        if (figure.equalsIgnoreCase("Квадрат") || figure.equals("1")) {
            System.out.println("Введите сторону квадрата:");
            String storona = scanner.nextLine();
            //"234" сторону ввели в виде текста
            int a = Integer.parseInt(storona);

            if (action.equalsIgnoreCase("Площадь") || action.equals("1")) {
                System.out.println("Площадь квадрата:" + (a * a));
            } else {
                System.out.println("Периметр квадрата:" + (a * 4));
            }

        }
        if (figure.equalsIgnoreCase("Треугольник") || figure.equals("2")) {
            System.out.println("Введите сторону треугольника:");
            String storona1 = scanner.nextLine();
            String storona2 = scanner.nextLine();
            String storona3 = scanner.nextLine();
            //"234" сторону ввели в виде текста
            int a = Integer.parseInt(storona1);
            int b = Integer.parseInt(storona2);
            int c = Integer.parseInt(storona3);
            //System.out.println("Введите высоту треугольника:");
           // String storona4 = scanner.nextLine();
           // int h = Integer.parseInt(storona4);

            if (action.equalsIgnoreCase("Площадь") || figure.equals("2")) {
                double s = (a + b + c) / 2.0d;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("Площадь: " + area);
            } else {
                System.out.println("Периметр треугольника: " + (a + b + c));
            }

        }
        if (figure.equalsIgnoreCase("Круг") || figure.equals("3")) {
            System.out.println("Введите радиус круга:");
            String radius = scanner.nextLine();
            int r = Integer.parseInt(radius);
            if (action.equalsIgnoreCase("Площадь") || figure.equals("2")) {
                double n = 3.14;
                System.out.println("Площадь круга: " + (r * n));
            } else {
                double n = 3.14;
                System.out.println("Периметр круга: " + (2 * r * n));
            }
        }
        if (figure.equalsIgnoreCase("Овал") || figure.equals("4")) {
            System.out.println("Введите длину большой полуоси и малой полуоси:");
            String side1 = scanner.nextLine();
            int a = Integer.parseInt(side1);
            String side2 = scanner.nextLine();
            int b = Integer.parseInt(side2);
            if (action.equalsIgnoreCase("Площадь: ") || figure.equals("2")) {
                double n = 3.14;
                System.out.println("Площадь: " + (n * a * b));
            } else {
                System.out.println("Периметр: " + (4 * (Math.PI * a * b + (a - b)) / a + b));
            }
        }
        if (figure.equalsIgnoreCase("Параллелограмм") || figure.equals("5")) {

            System.out.println("Введите основание параллелограмма, боковую сторону и высоту:");
            String side1 = scanner.nextLine();
            int a = Integer.parseInt(side1);
            String side2 = scanner.nextLine();
            int b = Integer.parseInt(side2);
            String side3 = scanner.nextLine();
            int h = Integer.parseInt(side3);
            if (action.equalsIgnoreCase("Площадь: ") || figure.equals("2")) {
                System.out.println("Площадь: " + (a * h));
            } else {
                System.out.println("Периметр: " + (2 * (a + b)));
            }
        }

    }
}
