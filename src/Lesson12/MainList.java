package Lesson12;

import java.util.*;

public class MainList {


    public static void main(String[] args) {
        Collection<Integer> a = new ArrayList<>();
        Collection<Integer> b = new ArrayList<>();
        Collection<Integer> result = new ArrayList<>();
        a.add(9);
        a.add(8);
        a.add(4);

        b.add(6);
        b.add(4);
        b.add(8);

        Collections c = new Collections();
       //result = c.union(a, b); //Объединение двух коллекций с дубликатами
       result = c.intersection(a, b); //Пересечение двух коллекций с дубликатами !!
       //result = c.unionWithoutDuplicate(a, b); //объединение массива без дубликатов
       // result = c.intersectionWithoutDuplicate(a, b); //Пересечение двух коллекций без дубликатов
      //result = c.difference(a, b); //Разность двух коллекций
        System.out.println(result);

    }
}
