package lesson3;

public class Main7 {
    public static void main(String[] args) {
        String name = "Alexandr";

       char[] simvols = name.toCharArray();
        for(int i = 0; i < simvols.length; i++) {
            if(simvols[i]=='a' || simvols[i]=='o' || simvols[i]=='e') {
                System.out.println(simvols[i]);
            }
        }
    }
}
