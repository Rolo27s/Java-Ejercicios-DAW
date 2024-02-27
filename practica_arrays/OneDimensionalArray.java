package java_ejercicios_daw.practica_arrays;

public class OneDimensionalArray {

    public static void main(String[] args) {
        // Create and initialize a one-dimensional array
        int[] myArray = {1, 2, 3, 4, 5};

        // Access and print elements of the array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + ": " + myArray[i]);
        }

        // Modify an element of the array
        myArray[2] = 10;
        System.out.println("Modified myArray[2]: " + myArray[2]);

        // Find the index of an element in the array
        int index = findIndex(myArray, 4);
        System.out.println("Index of 4 in myArray: " + index);
    }

    // Method to find the index of a given element in the array
    private static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}