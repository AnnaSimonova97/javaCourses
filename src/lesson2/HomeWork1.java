package lesson2;

public class HomeWork1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 150; i++) {
            if(i % 2 == 0) {
                sum = sum + i;
            }
        } System.out.println(sum);
    }
}
