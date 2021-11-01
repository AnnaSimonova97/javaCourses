package Lesson13;

import java.util.HashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10, 2.3, "Золото", 1900);
        Coin coin2 = new Coin(8, 2.3, "Золото", 1900);
        Coin coin3 = new Coin(5, 3.5, "Золото", 1960);
        Coin coin4 = new Coin(2, 2.0, "Серебро", 1800);
        Coin coin5 = new Coin(1, 1.5, "Бронза", 2000);

      /*  HashSet<Coin> coins = new HashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        for (Coin c : coins) {
            System.out.println(c);
        }*/
        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        for (Coin c : coins) {
            System.out.println(c);
        }

    }
}
