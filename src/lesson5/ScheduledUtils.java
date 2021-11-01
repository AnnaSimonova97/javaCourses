package lesson5;

public class ScheduledUtils {
    public static void reserve(boolean[][] scheduled, String day, int time) {
        int dayIndex = -1;
        if (day.equals("Пн")) {
            dayIndex = 0;
        }
        if (day.equals("Вт")) {
            dayIndex = 1;
        }
        if (day.equals("Ср")) {
            dayIndex = 2;
        }
        if (day.equals("Чт")) {
            dayIndex = 3;
        }
        if (day.equals("Пт")) {
            dayIndex = 4;
        }
        if (day.equals("Сб")) {
            dayIndex = 5;
        }
        if (day.equals("Вс")) {
            dayIndex = 6;
        }
        if(dayIndex == -1) {
            System.out.println("Такого дня не существует");
            return;
        }
        if (scheduled[time][dayIndex] == true) {
            System.out.println("Время бронирования - ЗАНЯТО");
        } else {
            scheduled[time][dayIndex] = true;
            System.out.println("Успешно забронировано!!!");
        }
    }
}
