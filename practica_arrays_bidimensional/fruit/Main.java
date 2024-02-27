package java_ejercicios_daw.practica_arrays_bidimensional.fruit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of fruits: ");
        int numOfFruits = scanner.nextInt();

        FruitTable table = new FruitTable(numOfFruits);

        table.fillTable(scanner);

        table.printTable();

        scanner.close();
    }
}
