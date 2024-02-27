package java_ejercicios_daw.practica_arrays;

import java.util.Scanner;
import java.util.Random;

public class WordShuffleGame {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a word
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        
        // Shuffle the characters of the word
        String shuffledWord = shuffleWord(word);
        
        // Present the shuffled word to the user
        System.out.println("Shuffled word: " + shuffledWord);
        
        // Ask the user to guess the word
        System.out.println("Guess the original word:");
        String guess = scanner.nextLine();
        
        // Check if the guess is correct
        if (guess.equalsIgnoreCase(word)) {
            System.out.println("Congratulations! You guessed the word correctly.");
        } else {
            System.out.println("Sorry, the correct word was: " + word);
        }
        
        // Close the scanner
        scanner.close();
    }

    // Method to shuffle the characters of a word
    private static String shuffleWord(String word) {
        // Convert the word to a character array
        char[] charArray = word.toCharArray();
        
        // Create a Random object to generate random indices
        Random random = new Random();
        
        // Shuffle the characters using Fisher-Yates algorithm
        for (int i = charArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            // Swap charArray[i] and charArray[index]
            char temp = charArray[i];
            charArray[i] = charArray[index];
            charArray[index] = temp;
        }
        
        // Convert the shuffled character array back to a string
        return new String(charArray);
    }
}
