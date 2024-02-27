package java_ejercicios_daw.practica_arrays;

public class CombinedArrayCreator {

    public static void main(String[] args) {
        // Initialize the first array
        int[] array1 = {1, 2, 3, 4, 5};
        
        // Initialize the second array
        int[] array2 = {6, 7, 8, 9, 10};

        // Combine the arrays
        int[] combinedArray = combineArrays(array1, array2);

        // Print the combined array
        System.out.println("Combined array:");
        for (int num : combinedArray) {
            System.out.print(num + " ");
        }
    }

    // Method to combine two arrays into a single array
    private static int[] combineArrays(int[] arr1, int[] arr2) {
        // Calculate the length of the combined array
        int combinedLength = arr1.length + arr2.length;

        // Initialize the combined array
        int[] combinedArray = new int[combinedLength];

        // Copy elements from the first array to the combined array
        for (int i = 0; i < arr1.length; i++) {
            combinedArray[i] = arr1[i];
        }

        // Copy elements from the second array to the combined array
        for (int i = 0; i < arr2.length; i++) {
            combinedArray[arr1.length + i] = arr2[i];
        }

        return combinedArray;
    }
}
