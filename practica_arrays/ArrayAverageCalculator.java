package java_ejercicios_daw.practica_arrays;

public class ArrayAverageCalculator {

    public static void main(String[] args) {
        // Initialize the array
        int[] array = {5, 10, 15, 20, 25};

        // Calculate the average
        double average = calculateAverage(array);

        // Print the average
        System.out.println("Average of array elements: " + average);
    }

    // Method to calculate the average of elements in the array
    private static double calculateAverage(int[] arr) {
        // Initialize sum to store the total sum of elements
        int sum = 0;

        // Iterate through the array to calculate the sum
        for (int num : arr) {
            sum += num;
        }

        // Calculate the average by dividing the sum by the total number of elements
        double average = (double) sum / arr.length;

        return average;
    }
}

