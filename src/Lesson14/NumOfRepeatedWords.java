package Lesson14;

import java.util.*;

public class NumOfRepeatedWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите в консоль текст, и я считаю количество повторяющихся слов");
        String words = scanner.nextLine().replaceAll("\\p{Punct}", "");

        String[] word = words.split(" ");
      

        HashMap<String, Integer> map = new HashMap<>();
        for (String t : word) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);

            } else {
                map.put(t, 1);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet)
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
      /*Set<String> keys = map.keySet();
        for (String key : keys) {
            for (Map.Entry<String, Integer> pair : map.entrySet()) {
                if (pair.getValue() == 1) {
                    map.remove(pair.getKey());
                }
            }
           Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<String,Integer> entry = iter.next();
               // Integer temp = entry.getValue();
                if(entry.getValue().equals(1)){
                    iter.remove();
                }
            }
            System.out.println(key);
            System.out.println(map.get(key));
        }*/
    }
}
