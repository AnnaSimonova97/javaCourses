package lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 77, 3, 8, 6, 8, 56, 9};
        for (int i = numbers.length - 1; i >= 0; i = i - 2) {
            System.out.println(numbers [i]);
        }
    }
}
