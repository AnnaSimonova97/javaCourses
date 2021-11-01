package Lesson13;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListHomeWork implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        if(strings == null || strings.equals("")) {
            throw new IllegalArgumentException("Ошибка: строка пуская или = 0");
        }
        List<String> c = new LinkedList<>();
        for (int i = 0; i < strings.length; i++) {
            c.add(strings[i]);
        }
        return c;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        if(data == null || data.isEmpty()) {
            throw new IllegalArgumentException("Ошибка: строка пуская или = 0");
        }
        List<Double> c = new LinkedList<>();
        c.addAll(data);
        c.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return Double.compare(o2, o1);
            }
        });
        return c;
    }
}
