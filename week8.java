package cs176l;
import java.util.Scanner;

public class week8 {

	public static void main(String[] args) {
		// First exercise - remove spaces from a string
		System.out.println("First exercise");
		Scanner removeSpaces = new Scanner(System.in);
		System.out.println("String with spaces: ");
		String sentence = removeSpaces.nextLine();

		StringBuilder something = new StringBuilder();
		
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (!Character.isWhitespace(currentChar)) {
            	something.append(currentChar);
            }
        }
        System.out.println("Input from the user with spaces: " + sentence);
        System.out.println("String without spaces: " + something);
        System.out.println("");
		
        
		// Second exercise - reversed string
		System.out.println("Second exercise");
		Scanner reverse = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String input = reverse.nextLine();
        
        StringBuilder reversed = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
		System.out.println("Input from the user: "+ input);
		System.out.println("Reversed string: " + reversed);
		System.out.println("");
		
		
		// Third exercise - remove letter
		System.out.println("Third exercise");
		Scanner removeLetter = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input1 = removeLetter.nextLine();
        System.out.println("Enter a character to remove: ");
        char characterToRemove = removeLetter.next().charAt(0);	
        
		StringBuilder remove = new StringBuilder();

        for (int i = 0; i < input1.length(); i++) {
            char currentChar = input1.charAt(i);
            if (currentChar != characterToRemove) {
            	remove.append(currentChar);
            }
        }
        System.out.println("Input from the user: " + input1);
		System.out.println("String: "+ remove + "without the letter " + characterToRemove);
		
		removeSpaces.close();
		reverse.close();
		removeLetter.close();


	}

	

}
