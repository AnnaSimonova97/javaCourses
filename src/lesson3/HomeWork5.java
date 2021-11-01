package lesson3;

public class HomeWork5 {
        public static void main(String[] args) {
            int[] numbers = {2, 6, 77, 3, 5, 6};
            int[] numbers2 = new int[numbers.length];

            for (int i = numbers.length - 1; i >=0; i--) {
                if (i - 1 < 0) {
                    numbers2[i - 1 + numbers.length] = numbers[i];
                } else {
                    numbers2[i - 1] = numbers[i];
                }
            }
            for (int i : numbers2) {
                System.out.println(i);
            }
        }
    }

