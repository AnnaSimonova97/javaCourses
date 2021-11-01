package Lesson6;

public class Person {
    private int age;
    private String name;
    private String surname;
    private int income;


    //конструктор
    public Person() {  // тип

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, String surname, int income, int age) {
        this.name = name;
        this.surname = surname;
        this.income = income;
        this.age = age;
    }

    public Person(String name, String surname, int income) {
        this.name = name;
        this.surname = surname;
        this.income = income;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getIncome() {
        return income;
    }

}
//связать треугольник круг прямоугольник квадрат трапеция конус овал