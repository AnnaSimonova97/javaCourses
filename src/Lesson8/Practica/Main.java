package Lesson8.Practica;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setNikName("Пришелец - 4764523");
        user.setPoints(50);
        user.setName("Виктор");

        User user2 = new User();
        user2.setName("Павел");
        user2.setNikName("Пришелец - HGF675");
        user2.setLevel(1);
        user2.setPoints(352);

        Orzv orzv1 = new Orzv(4,new Date());
        orzv1.setCommentary("Товар понравился");
        orzv1.setUser(user);
        orzv1.setStars(4);


        Tovar tovar1 = new Tovar();
        tovar1.setFullName("Вентилятор 4675");
        tovar1.setFullPrice(6900);
        tovar1.setSalePrice(5900);
        tovar1.addOrzvToTovar(orzv1);

        Orzv orzv2 = new Orzv();
        orzv2.setUser(user2);
        orzv2.setDate(new Date());
        orzv2.setStars(3);
        orzv2.setCommentary("Хорошо");

        tovar1.addOrzvToTovar(orzv2);
        double avg = tovar1.avgRating();
        System.out.println(avg);
    }
}
