package Lesson9;

import java.util.Arrays;

public class Dishes extends InfoOfDishDrinks {
    protected Ingredient[] ingredient = new Ingredient[20];


    public Dishes() {

    }

    public Dishes(String name, double weight, double price) {
        super(name, weight, price);
    }

    public Ingredient[] getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient[] ingredient) {
        this.ingredient = ingredient;
    }

    public void addIngridToDishes(Ingredient ingredients) {
        for (int i = 0; i < ingredient.length; i++) {
            if (ingredient[i] == null) {
                ingredient[i] = ingredients;
                break;
            }
        }
    }

   @Override
    public String toString() {
        super.toString();
        String text="";

        for (int i = 0; i < ingredient.length; i++) {
            if(ingredient[i]!=null) text = text + ingredient[i]+" ";
        }
        return " Блюдо {" + super.toString()+
                " Ингредиенты = { " + text +
                '}';
    }

}