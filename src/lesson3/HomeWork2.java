package lesson3;

public class HomeWork2 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 77, 3, 8, 7};
        int countEven = 0; //четный
        int countOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        if (countEven > countOdd) {
            System.out.println("В массиве больше четных чисел.");
        } else if (countEven < countOdd) {
            System.out.println("В массиве больше нечетных чисел.");
        } else if (countEven == countOdd) {
            System.out.println("В массиве равное количество четных и нечетных чисел.");
        }
    }
}