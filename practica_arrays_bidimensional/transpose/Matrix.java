package java_ejercicios_daw.practica_arrays_bidimensional.transpose;

import java.util.Scanner;

public class Matrix {
    private int[][] matrix;
    private int rows;
    private int columns;
    private Scanner scanner;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
        scanner = new Scanner(System.in);
    }

    public void inputMatrix() {
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public void transpose() {
        int[][] transposedMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        matrix = transposedMatrix;
        // Swap rows and columns
        int temp = rows;
        rows = columns;
        columns = temp;
    }

    public void printMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
