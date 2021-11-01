package Lesson14;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx { //основано на черном красном дереве. убодно для сортировки. быстрая относительно.но не такая быстрака как хэшмап
    public static void main(String[] args) {
       /* Map<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        treeMap.put(1,"a");
        treeMap.put(2,"в");
        treeMap.put(6,"и");
        treeMap.put(3,"ы");
        treeMap.put(5,"a");
        treeMap.put(4,"a");
        System.out.println(treeMap);*/ //скорость О log n

        Map<Integer, String> hashMap = new LinkedHashMap<>(16, 0.75f,true); //порядок вхождения сохраняется
        //все старые элементы с которым не работаем идут в начале списка
        //есть ссылки кто послее нее вошел и перед ней
        hashMap.put(1,"a");
        hashMap.put(2,"в");
        hashMap.put(6,"и");
        hashMap.put(3,"ы");
        hashMap.put(5,"a");
        hashMap.put(4,"a");
        System.out.println(hashMap);
       hashMap.get(6);
       hashMap.get(1);
       hashMap.get(4);
       System.out.println(hashMap);

    }
}
