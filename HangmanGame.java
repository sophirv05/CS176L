package cs176l;

import java.util.Scanner;

public class HangmanGame {
	private static final String[] WORDS = {"waffle", "pizza", "banana", "sausage", "cheesecake", "oatmeal"}; // Words for the game
    private static final int MAX_TRIES = 6; // Maximum allowed incorrect guesses

    private String chosenWord;
    private StringBuilder guessedWord;
    private int incorrectGuesses;
    private StringBuilder guessedLetters;

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        chooseWord();
        guessedWord = new StringBuilder("_".repeat(chosenWord.length() * 2 - 1)); 
        formatGuessedWord(); 
        incorrectGuesses = 0;
        guessedLetters = new StringBuilder();

        while (incorrectGuesses < MAX_TRIES && guessedWord.indexOf("_") != -1) {
            displayGameState();
            System.out.print("Enter a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);
            if (!Character.isLetter(guess) || guessedLetters.indexOf(String.valueOf(guess)) != -1) {
                System.out.println("Please enter a letter that you have not guessed before!");
                continue;
            }
            guessedLetters.append(guess);
            checkGuess(guess);
        }

        displayGameResult();
        scanner.close();
    }

    private void chooseWord() {
        int random = (int) (Math.random() * WORDS.length);
        chosenWord = WORDS[random];
    }

    private void displayGameState() {
        System.out.println("Currently guessed word: " + guessedWord);
        System.out.println("Guessed letters: " + guessedLetters);
        System.out.println("Incorrect guesses left: " + (MAX_TRIES - incorrectGuesses));
    }

    private void checkGuess(char guess) {
        boolean found = false;
        for (int i = 0; i < chosenWord.length(); i++) {
            if (chosenWord.charAt(i) == guess) {
                guessedWord.setCharAt(i * 2, guess);
                found = true;
            }
        }
        if (!found) {
            incorrectGuesses++;
        }
    }

    private void displayGameResult() {
        if (guessedWord.indexOf("_") == -1) {
            System.out.println("Congratulations! You guessed the word: " + chosenWord);
        } else {
            System.out.println("Oops! You ran out of guesses. The word was: " + chosenWord);
        }
    }

    private void formatGuessedWord() {
        for (int i = 0; i < chosenWord.length(); i++) {
            guessedWord.setCharAt(i * 2, '_');
            if (i != chosenWord.length() - 1) {
                guessedWord.setCharAt(i * 2 + 1, ' ');
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("				Welcome to Hangman Game!");
        System.out.println("			  The hint is: food! Guess the word!");
        System.out.println("");
        HangmanGame hangmanGame = new HangmanGame();
        hangmanGame.startGame();
    }
}
