package Lesson12;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(56);
        numbers.add(76);
        numbers.add(4);
        numbers.add(5);

        //for проход по коллекциям(доступен Листам)
        for(int i =0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // for each (по всем коллекциям)
        for(Integer num : numbers) {
            System.out.println(num);
        }
        //с помощью итератора (пример - лопатка из которой можно доставать элеменеты из коллекции)
        for(Iterator<Integer> iter = numbers.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }
}
