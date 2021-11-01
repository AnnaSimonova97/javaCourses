package Lesson6;

public class Main3 {
    public static void main(String[] args) {
        Person person1 = new Person(34); //вызван конструктор
        person1.setAge(24);
        person1.setIncome(100000);
        person1.setName("Ваня");
        person1.setSurname("Иванов");

        Person person2 = new Person("Влад","Сидоров",10000,34);
    }
}
