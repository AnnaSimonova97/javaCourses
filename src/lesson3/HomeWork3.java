package lesson3;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] numbers = {5, 33, 55, 3, 8, 7};
        double sum = 0;
        for(int i =0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        } double arithmetic = sum/ numbers.length;
        System.out.println(arithmetic);
    }
}
