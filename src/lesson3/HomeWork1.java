package lesson3;

public class HomeWork1 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 77, 3, 8, 6};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
