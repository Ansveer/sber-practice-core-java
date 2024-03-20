package ru.sber.base.syntax.task4.matrix;

public class MatrixMain {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        matrix1.rows = 2;
        matrix1.columns = 2;
        matrix1.matrix = new double[matrix1.rows][matrix1.columns];
        int k = 1;
        for (int i = 0; i < matrix1.columns; i++) {
            for (int j = 0; j < matrix1.rows; j++){
                matrix1.setValue(i, j, k);
                k += 1;
            }
        }
        matrix2.rows = 2;
        matrix2.columns = 2;
        matrix2.matrix = new double[matrix1.rows][matrix1.columns];
        for (int i = 0; i < matrix1.columns; i++) {
            for (int j = 0; j < matrix1.rows; j++){
                matrix2.setValue(i, j, k);
                k += 1;
            }
        }
        matrix1.printMatrix();
        System.out.println();
        matrix2.printMatrix();
        System.out.println();

        matrix2.sumMatrix(matrix1.matrix);
        matrix2.printMatrix();
        System.out.println();

        matrix2.numMultMatrix(2);
        matrix2.printMatrix();
        System.out.println();

        matrix1.matrix = matrix1.matrixMultiplication(matrix1.matrix, matrix2.matrix);
        matrix1.printMatrix();
    }
}
