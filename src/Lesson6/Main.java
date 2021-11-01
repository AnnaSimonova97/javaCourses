package Lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] tours = {{"Италия","7","400000","Самолет","5 звезд","полупансионат"},
                {"Италия","7","400000","Самолет","5 звезд","полупансионат"},
                {"Франция","4","100000","Автобус","4 звезд","пансионат"},
                {"Египет","10","40000","Самолет","3 звезды","полупансионат"},
                {"Египет","8","30000","Самолет","5 звезд","пансионат"},
                {"Тунис","8","30000","Автобус","2 звезды","полупансионат"}};

        Scanner scanner = new Scanner(System.in);
       // System.out.println("В какую страну хотите поехать?");
       // String country = scanner.nextLine();

       // ToursUtils.printToursByCountry(tours, country);
        System.out.println("На сколько дней хотите поехать?");
        String days = scanner.nextLine();

        ToursUtils.printToursByDays(tours, days);
    }
}
