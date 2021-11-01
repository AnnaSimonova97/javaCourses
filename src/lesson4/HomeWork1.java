package lesson4;

import java.util.Locale;

public class HomeWork1 {
    public static void main(String[] args) {
        String password = "fDHlg1D";
        String alphabet = "abcdefghijklmnopqrstuvwxyz".toLowerCase(); //перевели в заглавные буквы
        for(int i = 0; i < alphabet.length(); i++) {
            char current = alphabet.charAt(i);
            if (password.substring(0, 1).contains(current + "")) {
                System.out.println("Первая буква "+ current + " не является заглавной, поменяйте на заглавную букву");
            }
        }

        }
    }
