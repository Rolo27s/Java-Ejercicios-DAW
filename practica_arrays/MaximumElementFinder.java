package java_ejercicios_daw.practica_arrays;

public class MaximumElementFinder {

    public static void main(String[] args) {
        // Initialize the array
        int[] array = {10, 4, 7, 25, 16, 30, 12};

        // Find the maximum element
        int max = findMaximum(array);

        // Print the maximum element
        System.out.println("Maximum element in the array: " + max);
    }

    // Method to find the maximum element in the array
    private static int findMaximum(int[] arr) {
        // Initialize max with the first element of the array
        int max = arr[0];

        // Iterate through the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
