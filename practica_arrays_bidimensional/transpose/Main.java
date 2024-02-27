package java_ejercicios_daw.practica_arrays_bidimensional.transpose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create the matrix object
        Matrix matrix = new Matrix(rows, columns);

        // Input the elements of the matrix
        matrix.inputMatrix();

        // Print the original matrix
        System.out.println("Original Matrix:");
        matrix.printMatrix();

        // Transpose the matrix
        matrix.transpose();

        // Print the transposed matrix
        System.out.println("\nTransposed Matrix:");
        matrix.printMatrix();

        // Close the scanner
        scanner.close();
    }
}
