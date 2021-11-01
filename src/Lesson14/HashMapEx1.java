package Lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapEx1 {
    //HashMap работает по принципу хеширования-преобразование
    //ключ должен быть уникальным. значение не обязательно
    //создался массив из 16 корзин
    //хешкод делить на 16 = первое число остаток от деления число кладем в соответствующую ячейку.
    //колизия - у разных объектов совпадает хешкод

    //+ высокая скорость
    //если нужно связать два объекта

    public static void main(String[] args) {
      /* Map<String,Double> map = new HashMap<>();
        map.put("Vlad", 4.5);
        map.put("Ira", 5.6);
        map.put(null, 5.5); //можно класть null как ключ, то кладется в нулевую корзину
        System.out.println(map);
        map.put("Vlad", 5.7);
        System.out.println(map);*/

      /*  Map<String, List<Integer> nameAndMany = new HashMap<>();
        List<Integer> intList = new ArrayList<>();
        intList.add(6);
        intList.add(7);
        intList.add(33);
        intList.add(9);
        nameAndMany.put("Джон Доу", intList);
        System.out.println(nameAndMany);*/

       Map<String, Double> nameAndMany = new HashMap<>();
        nameAndMany.put("Джон Доу", 3443.5);
        nameAndMany.put("Toм Смит", 123.22);
        nameAndMany.put("Джейн Бейкер", 1378.00);
        nameAndMany.put("Тод Холл", 99.22);
        nameAndMany.put("Ральф Смит", -19.98);
        System.out.println(nameAndMany);

        System.out.println(nameAndMany.get("Джон Доу"));

        for (Map.Entry<String, Double> m : nameAndMany.entrySet() ) {
            System.out.println(m.getKey() + " : ");
            System.out.println(m.getValue());
        }


    }
}
