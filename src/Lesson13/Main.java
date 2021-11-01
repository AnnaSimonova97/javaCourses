package Lesson13;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       /* LinkedHashSet<String> string = new LinkedHashSet<>(); //учитывается порядок вхождения
        string.add("fhh");
        string.add("ddd");
        string.add("kkk");
        string.add("ddd");
        string.add("kkk");
        System.out.println(string);

        //хэширование - навигация что бы бысто был поиск

        HashSet<String> string1 = new HashSet<>(); // не учитывается порядок вхождения
        string1.add("fhh");
        string1.add("ddd");
        string1.add("kkk");
        string1.add("ddd");
        string1.add("kkk");
      //  System.out.println(string1);*/

        //
       /* TreeSet<Integer> s = new TreeSet<>(new IntegerReverse()); //отлиц.-влево. положит. - вправо
        s.add(7);
        s.add(8);
        s.add(4);
        s.add(3);
        System.out.println(s);*/

        TreeSet<Integer> s = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }); // внутренний безымянный класс
        s.add(7);
        s.add(8);
        s.add(4);
        s.add(3);
        System.out.println(s);
    }
}
