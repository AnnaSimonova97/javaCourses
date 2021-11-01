package Lesson9;

public class Main {
    public static void main(String[] args) {

        Ingredient ingredient1 = new Ingredient("Свекла","200 гр.");
        Ingredient ingredient2 = new Ingredient("Капуста"," 300 гр.");
        Ingredient ingredient3 = new Ingredient("Картошка"," 400 гр.");
        Ingredient ingredient4 = new Ingredient("Говядина"," 350 гр.");

        Dishes dishes = new Dishes("Борщ",200.00,1000);

        dishes.addIngridToDishes(ingredient1);
        dishes.addIngridToDishes(ingredient2);
        dishes.addIngridToDishes(ingredient3);
        dishes.addIngridToDishes(ingredient4);

        Ingredient ingredient5 = new Ingredient("Макароны","300 гр.");
        Ingredient ingredient6 = new Ingredient("Кетчуп"," 300 гр.");
        Ingredient ingredient7 = new Ingredient("Помидор"," 500 гр.");

        Dishes dishes2 = new Dishes("Паста",450.00,900);
        dishes2.addIngridToDishes(ingredient5);
        dishes2.addIngridToDishes(ingredient6);
        dishes2.addIngridToDishes(ingredient7);

        Drinks drinks = new Drinks("Голубая лагуна",400,500);

        System.out.println(drinks);
        System.out.println(dishes);

        Menu menu = new Menu();
        menu.addDishes(dishes);
        menu.addDishes(drinks);
        menu.addDishes(dishes2);

        System.out.println(menu);
    }
}