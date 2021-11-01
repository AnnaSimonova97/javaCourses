package Lesson14;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

//есть 4 типа ссылок. имеют значения для гарбидж коллектор котрый очищает память

public class WeakHashMapMain {
    public static void main(String[] args) {
        Map<Date, String> weakMap = new WeakHashMap<>();
        Date date = new Date();
        weakMap.put(date,"information");

        date = null;
        System.gc();

        for(int i = 0; i < 10000; i++) {
            if(weakMap.isEmpty()) {
                System.out.println("Empty! " + i);
                break;
            }
        }
    }
}
//найти все способы как можно пройтись по мэпам
//