package lesson4;


public class Main2 {
    public static void main(String[] args) {
        String email = "fhdkfs@dfmb.com";

        String[] partsOfEmail = email.split("@"); //кладем символ по которому разрезаем
        if (partsOfEmail.length != 2) {
            System.out.println("Здесь не одна собачка или ее вообще нет.");
            return;
        }
        if (email.startsWith(".") || email.endsWith(".")) { //начинается с точки

        }
    }
}
