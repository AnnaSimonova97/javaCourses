package Lesson9;

public class Drinks extends InfoOfDishDrinks {
    public Drinks() {

    }

    public Drinks(String name, double weight, double price) {
        super(name, weight, price);
    }

    @Override
    public String toString() {
        return name + " " + weight + " "+ price;
    }
}
