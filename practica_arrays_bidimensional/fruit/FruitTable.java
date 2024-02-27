package java_ejercicios_daw.practica_arrays_bidimensional.fruit;

import java.util.Scanner;

public class FruitTable {
    private String[] fruits;
    private int[][] info;

    public FruitTable(int numOfFruits) {
        fruits = new String[numOfFruits];
        info = new int[numOfFruits][3]; // 3 columns for amount, price, and date of expiry
    }

    public void fillTable(Scanner scanner) {
        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Enter the name of fruit " + (i + 1) + ": ");
            fruits[i] = scanner.next();
            System.out.print("Enter the amount of " + fruits[i] + ": ");
            info[i][0] = scanner.nextInt(); // Amount
            System.out.print("Enter the price of " + fruits[i] + ": ");
            info[i][1] = scanner.nextInt(); // Price
            System.out.print("Enter the date of expiry of " + fruits[i] + " (in days): ");
            info[i][2] = scanner.nextInt(); // Date of expiry
        }
    }

    public void printTable() {
        System.out.println("Fruit Table:");
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Fruit", "Amount", "Price", "Expiry Date");
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("%-15s%-15d%-15d%-15d\n", fruits[i], info[i][0], info[i][1], info[i][2]);
        }
    }
}
