package Lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> texts = new ArrayList<>();
        texts.add(6);
        texts.add(7);
        texts.add(36);
        texts.set(0, 8);

        System.out.println(texts);
// Collection
        // Set - нет индексовб порядка нет
        // List - есть индексы. есть порядок вхождения :
        // ArrayList, LinkedList(удалить вернуть добавить первого последнего)
        // 11 21 31...всегда дольше добавляется. можно добавить шаг не 10 а 100 например

        LinkedList<Integer> list = new LinkedList<>();
        //расположение хаотичное но связанны ссылками, которые организуют порядок. можно часто добавлять и удалять
        //практически все методы быстрые. НО метод get самый долгий(метод перебора узнает направление больше 0 меньше 1000 500 <->
        // метод двойного деления
    }
}