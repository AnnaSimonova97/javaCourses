package lessonlesson1;


import java.util.HashMap;
import java.util.Map;

public class Main1 {
    //Map массив по ассоциациям, объект HashMap/ ключ=индекс, значение;
    public static void main(String[] args) {
        HashMap<String,Integer> footballTable = new HashMap<>();
       footballTable.put("Динамо", 5);
        footballTable.put("Шахнет", 4);
        footballTable.put("Спартак", 2);
        footballTable.put("Динамо", 7);

        System.out.println(footballTable);

        for(Map.Entry<String, Integer> crew : footballTable.entrySet()) { //пара ключ-значение его тип entrySet/ безразмерный массив этих объектов
            System.out.println(crew.getKey());
            System.out.println(crew.getValue());
        }
    for(String key :footballTable.keySet()) {
        System.out.println(key);
        System.out.println(footballTable.get(key));
    }
    }
}
