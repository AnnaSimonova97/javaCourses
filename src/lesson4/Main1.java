package lesson4;

import java.util.Locale;

public class Main1 {
    public static void main(String[] args) {
        //всегда два варианта после =
        // String text = new String();
        // String text1 ="Hello World!"; //Объект. создалась ссылка на объект текст1
        // text1 = "dfjdsfdjks"; объект текс1 потерял ссылку
        String password = "dFfhdHlg1D";

        int passwordLength = password.length(); // в круглых скобках указывают конкретно что надо взять. пример возьми ключ
        if(passwordLength < 8) {
            System.out.println("Пароль слишком короткий");
            return; // остановим эту строку если не подходит но надо продолжить программу
        }
        if(!password.contains("0") && !password.contains("1") && !password.contains("2") &&
                !password.contains("3") &&
                !password.contains("4") &&
                !password.contains("5") &&
                !password.contains("6") &&
                !password.contains("7") &&
                !password.contains("8") &&
                !password.contains("9")) {
            System.out.println("В пароле нет цыфры");
            return;
        }
        String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase(); //перевели в заглавные буквы
        for(int i = 0; i < alphabet.length(); i++) {
            char currentCharFromAlphabet = alphabet.charAt(i); //достать символ по позиции 0
            if(password.contains(currentCharFromAlphabet + "")) { //ругался потому что хотел группу символов и поставили кавычки
                System.out.println("Это большая буква: " + currentCharFromAlphabet);
            }
        }
        String alphabet2 = "abcdefghijklmnopqrstuvwxyz".toLowerCase(); //перевели в заглавные буквы
        for (int i = 0; i < alphabet2.length(); i++) {
            char current = alphabet2.charAt(i);
            if (password.substring(0, 1).contains(current + "")) {
                System.out.println("Первая буква " + current + " не является заглавной, поменяйте на заглавную букву");
            }
        }

        char[] chAr = password.toCharArray();

        for (int i = 0; i < chAr.length; i++) {
            char ch1 = chAr[i];
            for (int j = i + 1; j < chAr.length; j++) {
                if (ch1 == chAr[j]) {
                    // System.out.println(ch1);
                    System.out.println("Буквa " + ch1 + " использована в пароле больше одного раза, замените пароль.");
                }

            }
        }
    }
}

