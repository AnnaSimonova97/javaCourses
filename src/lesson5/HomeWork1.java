package lesson5;

public class HomeWork1 {
    public static void main(String[] args) {
        String text = "Сегодня отличный день!";

        Methods.printReverse(text);

        int glass = Methods.countGlass(text);
        System.out.println(glass);

        Methods.printByWord(text);

    }
}
