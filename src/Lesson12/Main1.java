package Lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

//чем больше нулей тем быстрее работает аррайлист

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();

        long startTimeArrAdd = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add("hello" + i);
        }
        long endTimeArrAdd = System.currentTimeMillis();
        System.out.println("ArrayList add: " + (endTimeArrAdd - startTimeArrAdd));

        long startTimeLinkAdd = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add("kkkkk" + i);
        }
        long endTimeLinkAdd = System.currentTimeMillis();
        System.out.println("LinkedList add: " + (endTimeLinkAdd - startTimeLinkAdd));


        //


    long startTimeArrGet = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
        arrayList.get(i);
    }
    long endTimeArrGet = System.currentTimeMillis();
        System.out.println("ArrayList add: " + (endTimeArrGet - startTimeArrGet));

    long startTimeLinkGet = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
        linkedList.get(i);
    }
    long endTimeLinkGet = System.currentTimeMillis();
        System.out.println("LinkedList add: " + (endTimeLinkGet - startTimeArrGet));
}
    }



