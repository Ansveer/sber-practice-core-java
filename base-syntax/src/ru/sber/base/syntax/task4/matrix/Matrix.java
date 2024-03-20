package ru.sber.base.syntax.task4.matrix;

public class Matrix {
    public int columns;
    public int rows;
    public double[][] matrix;

    public void setValue(int i, int j, int value) {
        matrix[i][j] = value;
    }

    public void sumMatrix(double[][] matrix2) {
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
    }

    public void numMultMatrix(int k) {
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = matrix[i][j]*k;
            }
        }
    }

    public double[][] matrixMultiplication(double[][] matrix1, double[][] matrix2) {
        double[][] matrix = new double[rows][columns];
        double sum = 0;
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++){
                    sum = sum + matrix1[i][k]*matrix2[k][j];
                }
                matrix[i][j] = sum;
                sum = 0;
            }
        }
        return matrix;
    }

    public void printMatrix() {
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
