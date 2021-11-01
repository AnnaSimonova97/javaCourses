package Lesson13;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class MainHomeWork {
    public static void main(String[] args) {

        List<String> result = new LinkedList<>();
        String a = "Пингвин";
        String b = "Собака";
        String c = "Кот";
        String d = "Попугай";

        ListHomeWork list = new ListHomeWork(); // создали объект класса
        result = list.asList(a, b,c,d);
        System.out.println(result);

        List<Double> RDList = new LinkedList<>();
        RDList.add(5.6);
        RDList.add(4.6);
        RDList.add(7.8);
        RDList.add(0.4);

        List<Double> DResult = new LinkedList<>();
        DResult = list.sortedList(RDList);
        System.out.println(DResult);

    }
}
