package Lesson9;

public class Menu {
    private Object[] menuList = new Object[100];


    public void addDishes(InfoOfDishDrinks item) {
        for (int i = 0; i < menuList.length; i++) {
            if (menuList[i] == null) {
                menuList[i] = item;
                break;
            }
        }
    }
    @Override

    public String toString() {
        String text="";
        for (int i = 0; i < menuList.length; i++) {
            if(menuList[i]!=null) text = text + menuList[i]+" "+"\n";
        }
        return "Меню" + text;
    }
}
