package lesson3;

public class Main4 {
    public static void main(String[] args) {
        int[] numbers = new int[7];
       /* numbers [0] = 10;
        numbers [1] = 12;
        numbers [2] = 14;
        numbers [3] = 16;
        numbers [4] = 18;
        numbers [5] = 20;
        numbers [6] = 22; */

        int value = 10;

        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = value;
            value = value + 2;
        }
    }
}
