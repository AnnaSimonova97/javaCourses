package Lesson11;

public class Main1 {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar(600, "Мышка", 5788);
        Tovar tovar2 = new Tovar(600, "Мышка", 5788);
        Tovar tovar3 = tovar1;

        System.out.println(tovar1.equals(tovar2)); //== проверяет адрес куда смотрит две ссылки.
        // они одинаковые но объекты разные в памяти, поэтому они не равны.
        String text1 = "1234"; //immutable
        String text2 = "1234";
        System.out.println(text1.equals(text2));
        System.out.println(tovar1);

    }
}
