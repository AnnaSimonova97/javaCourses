package lesson1;

public class Main1 {
    public static void main(String[] args) {
        double widthRoom = 4.5;
        double lengthRoom = 6;
        double widthTable = 1.2;
        double lengthTable = 2;

        double sRoom = widthRoom * lengthRoom;
        double sTable = widthTable * lengthTable;
        //преобразование типов
        //внизходящее (автоматически)
        //вверхходящее
        int countTable = (int) (sRoom / sTable);

        System.out.println(countTable);

    }
}
