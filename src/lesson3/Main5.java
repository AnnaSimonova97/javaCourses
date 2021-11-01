package lesson3;

public class Main5 {
    public static void main(String[] args) {

        int[] number = {2,3,4,5,6};
        int[] number2 = new int[number.length];

       /* number2[0] = number[4];
        number2[1] = number[3];
        number2[2] = number[2];
        number2[3] = number[1];
        number2[4] = number[0];*/
        int j = number.length - 1;
        for(int i = 0; i < number.length; i++) {
            number2[i] = number[j];
            j--;
            System.out.print(number2[i] + " ");
        }
    }
}
