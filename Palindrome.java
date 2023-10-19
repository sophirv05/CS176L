package cs176l;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner word = new Scanner(System.in);
		System.out.print("Input the string: ");
		String check = word.nextLine();
					
			
		if (checkIfPalindrome(check)) {
			System.out.println("Yes! The word it is a palindrome.");
		} else {
			System.out.println("No! The word it is not a palindrome.");
		}
		word.close();
    }

    public static boolean checkIfPalindrome(String word) {
        word = word.toLowerCase();
        
        word = word.replaceAll("[^a-z]", "");
        
        // Checking if it is palindrome 
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
