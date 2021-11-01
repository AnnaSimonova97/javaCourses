package Lesson11;


public class Main {
    public static void main(String[] args) {
        IMatrix matrix = new Matrix(3, 2);
        IMatrix matrix2 = new Matrix(2, 3);
        IMatrix matrix3 = new Matrix(2, 3);

        // System.out.println(matrix.getRows());

       matrix = Matrix.fullMatrix(matrix);
        System.out.println();

        matrix2 = Matrix.fullMatrix(matrix2);
       matrix.printToConsole();
        System.out.println();
        matrix2.printToConsole();
        System.out.println();
        // matrix.fillMatrix(1);
      //  matrix.printToConsole();

     matrix3 = matrix.mul(matrix2);
       matrix3.printToConsole();

        if(matrix.isSquareMatrix()) {
            System.out.println("Матрица - квадратная");
        } else {
            System.out.println("Матрица - не квадратная");
        }

        if (matrix.isIdentityMatrix()) {
            System.out.println("Матрица - единичная");
        } else {
            System.out.println("Матрица - не единичная");
        }

        if (matrix.isNullMatrix()) {
            System.out.println("нулевая матрица");
        } else {
            System.out.println("матрица не нулевая");
        }



      /*  System.out.println("Сложение");
       matrix.printToConsole();
        System.out.println("+++++");
        matrix2.printToConsole();
        System.out.println("=");
        matrix3 = matrix.add(matrix2);
        matrix3.printToConsole();

        System.out.println("Вычитание");
        matrix.printToConsole();
        System.out.println("----");
        matrix2.printToConsole();
        System.out.println("=");
        matrix3 = matrix.sub(matrix2);
        matrix3.printToConsole();*/

        /*System.out.println();
        System.out.println("Умножение");
        matrix.printToConsole();
        System.out.println("****");
        matrix2.printToConsole();
        System.out.println("=");
        matrix3 = matrix.mul(matrix2);
        matrix3.printToConsole();
       // System.out.println(matrix.getValueAt(0,0));

       /* System.out.println();
        System.out.println("Умножение на число");
        matrix.printToConsole();
        System.out.println("****");
        System.out.println(5);
        System.out.println("=");
       matrix3 = matrix.mul(5);
        matrix3.printToConsole();*/
        // System.out.println();
        // matrix2 = matrix.transpose();
        // matrix2.printToConsole();

    }
}
