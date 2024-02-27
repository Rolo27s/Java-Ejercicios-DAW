package java_ejercicios_daw.practica_arrays;

public class MinimumElementFinder {

    public static void main(String[] args) {
        // Initialize the array
        int[] array = {10, 4, 7, 25, 16, 30, 12};

        // Find the minimum element
        int min = findMinimum(array);

        // Print the minimum element
        System.out.println("Minimum element in the array: " + min);
    }

    // Method to find the minimum element in the array
    private static int findMinimum(int[] arr) {
        // Initialize min with the first element of the array
        int min = arr[0];

        // Iterate through the array to find the minimum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}

