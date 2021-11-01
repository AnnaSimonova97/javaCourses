package Lesson10.Shoemaker;

public class Main {
    public static void main(String[] args) {
        Tufli tufli1 = new Tufli();
        Tufli tufli2 = new Tufli();
        Tufli tufli3 = new Tufli();

        Boots boots1 = new Boots();
        Boots boots2 = new Boots();
        Boots boots3 = new Boots();

        Obuv[] obuvs = new Obuv[6];
        obuvs[0] = tufli1;
        obuvs[1] = tufli2;
        obuvs[2] = boots2;
        obuvs[3] = boots1;
        obuvs[4] = tufli3;
        obuvs[5] = boots3;

        for (Obuv o : obuvs) {
            o.pochinit(); // роявление полиморфизма
        }


    }
}
