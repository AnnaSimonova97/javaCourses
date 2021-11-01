package lesson3;

public class HomeWork4 {

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
                for (int i : numbers2) { // for each используется для быстрого прохода по списку с выводом на консоль
                    System.out.println(i);
                }
            }
        }