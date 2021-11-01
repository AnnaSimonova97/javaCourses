package Lesson11;

public class Matrix implements IMatrix {
    private double[][] matrix;
    private int rowIndex;
    private int colIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColIndex() {
        return colIndex;
    }

    public void setColIndex(int colIndex) {
        this.colIndex = colIndex;
    }

    public Matrix() {

    }

    public Matrix(int rows, int cols) {
        matrix = new double[rows][cols];
    }

    static IMatrix fullMatrix(IMatrix mMatrix) {
        for (int i = 0; i < mMatrix.getRows(); i++) {
            for (int j = 0; j < mMatrix.getColumns(); j++) {
                mMatrix.setValueAt(i, j, (Math.random() * 10));
            }

        }
        return mMatrix;
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex > this.getRowIndex() || rowIndex < 0) {
            throw new IndexOutOfBoundsException("Индекс строки больше исходного размера");
        }
        if (colIndex > this.getColIndex() || colIndex < 0) {
            throw new IndexOutOfBoundsException("Индекс столбца больше исходного размера");
        }
        return this.matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex > this.getRowIndex() || rowIndex < 0) {
            throw new IndexOutOfBoundsException("Индекс строки больше исходного размера");
        }
        if (colIndex > this.getColIndex() || colIndex < 0) {
            throw new IndexOutOfBoundsException("Индекс столбца больше исходного размера");
        }
        this.matrix[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("Матрицы не равны по строкам");
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Матрицы не равны по колонкам");
        }
        if (otherMatrix.getValueAt(rowIndex, colIndex) == 0) {
            throw new NullPointerException("Матрица = 0");
        }

        IMatrix temp = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < otherMatrix.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {

                temp.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return temp;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("Матрицы не равны по строкам");
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Матрицы не равны по колонкам");
        }
        if (otherMatrix.getValueAt(rowIndex, colIndex) == 0) {
            throw new NullPointerException("Матрица = 0");
        }

        Matrix temp = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < otherMatrix.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {

                temp.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return temp;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("Матрицы не равны по строкам");
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Матрицы не равны по колонкам");
        }
        if (otherMatrix.getValueAt(rowIndex, colIndex) == 0) {
            throw new NullPointerException("Матрица = 0");
        }

        Matrix temp = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                for (int k = 0; k < this.getColumns(); k++) {
                    temp.setValueAt(i, j, (this.getValueAt(i, k) * otherMatrix.getValueAt(k, j)));
                }

                // temp.setValueAt(i, j, this.getValueAt(i, j) * otherMatrix.getValueAt(i,j));
            }
        }
        return temp;

    }


    @Override
    public IMatrix mul(double value) {
        Matrix temp = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {

                temp.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return temp;
    }

    @Override
    public IMatrix transpose() {
        Matrix temp = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {

                temp.setValueAt(j, i, this.getValueAt(i, j));
            }
        }
        return temp;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                this.setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant() {

        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getValueAt(i, j) != 0) return false;
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (((getRowIndex() == getColIndex()) && this.getValueAt(i, j) == 1)
                        && (getRowIndex() != getColIndex()) && this.getValueAt(i, j) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getRows() == this.getColumns()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%.1f", matrix[i][j]) + " ");
                //System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}





