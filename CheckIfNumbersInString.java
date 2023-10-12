package cs176l;

import java.util.Scanner;

public class CheckIfNumbersInString {

	public static void main(String[] args) {
		Scanner check = new Scanner(System.in);
		System.out.print("String: ");
		String string = check.next();
		
		int length = string.length();
		int count = 0;		
		int total = 0;
		
		while (count < length) {
			char character = string.charAt(count);
			boolean number = Character.isDigit(character);
			
			if (number==true) {
				total += 1;
				break;
			}
			count +=1;		
		}
		if (total>=1) {
			System.out.print(string + " contains numerical characters, please check it again");
		} else {
			System.out.print(string + " does not contain numerical characters");
		}
		
		

		
	}

}
