package Lesson10.Shoemaker;

public class Tufli extends Obuv implements ObuvForFix {
    private String kindOfMaterial;

    @Override
    public void pochinit() {
        System.out.println("Чиним туфли!!!");
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
