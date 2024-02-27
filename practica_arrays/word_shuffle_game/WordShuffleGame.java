package java_ejercicios_daw.practica_arrays.word_shuffle_game;

import java.util.Scanner;
import java.util.Random;

public class WordShuffleGame {
    private String word;
    private String shuffledWord;
    private Scanner scanner;

    public WordShuffleGame() {
        scanner = new Scanner(System.in);
    }

    public void play() {
        // Ask the user to enter a word
        System.out.println("Enter a word:");
        word = scanner.nextLine();

        // Shuffle the characters of the word
        shuffleWord();

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
    }

    // Method to shuffle the characters of a word
    private void shuffleWord() {
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
        shuffledWord = new String(charArray);
    }

    public void closeScanner() {
        scanner.close();
    }
}
