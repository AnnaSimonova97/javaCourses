package Lesson10.Shoemaker;

public class Boots extends Obuv implements ObuvForFix {

    public void pochinit() {
        System.out.println("Чиним САПОГИ!");
    }

    @Override
    public String kindOfMaterial() {
        return null;
    }

    @Override
    public String sole() {
        return null;
    }

    @Override
    public int condition() {
        return 0;
    }
}
