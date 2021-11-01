package Lesson6;

public class ToursUtils {

    public static void printToursByCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            if (country.equals(tours[i][0])) {
                System.out.printf("%s, %s дней, %s руб., %s, %s, %s \n", tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4], tours[i][5]);
            }
        }
    }

    public static void printToursByDays(String[][] tours, String days) {
        int daysTrip = Integer.parseInt(days);

        for (int i = 0; i < tours.length; i++) {
            int daysCurrentTrip = Integer.parseInt(tours[i][1]);
            if (daysCurrentTrip >= daysTrip - 2 && daysCurrentTrip <= daysTrip + 2) {
                System.out.printf("%s, %s дней, %s руб., %s, %s, %s  \n", tours[i][0], tours[i][1], tours[i][2], tours[i][3], tours[i][4], tours[i][5]);
            }

        }
    }
}
