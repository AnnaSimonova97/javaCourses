package lesson2;

public class Main {
    public static void main(String[] args) {
        //управляющая конструкция
        //boolean 8-й примитивный тип(true, false)
        // boolean x = 5 > 8
        //Логические операторы: >, >=, <,<=, ==, !=
        //Объединенте выражений: &&-и в тоже самое время, ||- или
        //математические операторы: + - * /  %  --  ++
        //сокращенная запись += -= /= %=  *=
        //то что можно увидеть: 0.0/0.0 - NaN(не число); 12/0.0 infinity бесконечно много;
        int a = 6;
        int b = 6;
        int c = 5;

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else if ((a == b && b != c && c != a) ||
                (b == c && a != b && c != a) ||
                (c == a && a != b && b != c)) {
            System.out.println("Это равнобедренный треугольник");
        } else {
            System.out.println("Тогда не знаю, что это такое");
        }
    }
}
