package lesson1;

public class HomeWork2 {
    public static void main(String[] args) {
        double aTable = 1;
        double bTable = 0.5;
        double hTable = 2;

        double aBook = 0.15;
        double bBook = 0.04;
        double hBook = 0.20;

        double vTable = aTable * bTable * hTable;
        double vBook = aBook * bBook * hBook;

        int countBook = (int) (vTable / vBook);
        System.out.println(countBook);
    }
}
