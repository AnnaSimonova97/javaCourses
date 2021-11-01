package lesson5;

public class Methods {
   public static void printReverse(String text) {
        char[] array = text.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        System.out.println(result);
    }

    public static int countGlass(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'а' ||
                    text.charAt(i) == 'о' ||
                    text.charAt(i) == 'э' ||
                    text.charAt(i) == 'е' || text.charAt(i) == 'и'
                    || text.charAt(i) == 'ы' || text.charAt(i) == 'у' ||
                    text.charAt(i) == 'ё' || text.charAt(i) == 'ю' || text.charAt(i) == 'я' || text.charAt(i) == 'й') {
                count++;
            }
        }
        return count; //вопрос.Почему если ставлю в методе int и retern то ничего не выводит?

    }

    public static void printByWord(String text) {
        String[] text2 = text.split(" ", '!'); //как обозначить ! знак

        String a = text.replaceAll(" ", "\n");
        System.out.println(a);
    }

    public static int countAverage(int[][] nums) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) { //массив крутит по строке
                sum = (sum + nums[i][j]);
                count++;
            }
        }
        return sum/count;
    }
}



