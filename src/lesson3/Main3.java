package lesson3;

public class Main3 {
    public static void main(String[] args) {
        int money = 100000;
        int rate = 7;
        int years = 9;

        for(int year = 0; year < years; year++) {
            for (int month = 0; month < 12; month++) {
                money = money +((money/100*rate)/12);
            }
        }
        System.out.println(money);
    }
}
