package lesson1;

public class HomeWork4 {
    public static void main(String[] args) {
        int money = 1001;
        int pizza = 230;
        int gum = 26;
        double candy = 2.5;

        int countPizza = money / pizza;
        int newMoney = money - (countPizza * pizza);
// System.out.println(newMoney);
        int countGum = newMoney / gum;
        int newMoney2 = newMoney - (gum * countGum);
        int countCandy = (int)(newMoney2 / candy);
// сдача
       int count = newMoney2;

        System.out.println("Пиццы" + " " + countPizza);
        System.out.println("Жвачки" + " " + countGum);
        System.out.println("Конфет" + " " + countCandy);
        System.out.println("Сдача в магазине" + " " + count);

    }
}
