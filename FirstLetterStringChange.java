package cs176l;

import java.util.Scanner;

public class FirstLetterStringChange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter string: ");
		String string = s.next();
		char firstLetter = string.charAt(0);
		
		if (firstLetter == '0') { // 0er
			string.substring(1); //er
			System.out.print("zero" + string.substring(1)); // zeroer
		} else if (firstLetter == '1') {
			string.substring(1);
			System.out.print("one" + string.substring(1));
		} else if (firstLetter == '2') {
			string.substring(1);
			System.out.print("two" + string.substring(1));
		} else if (firstLetter == '3') {
			string.substring(1);
			System.out.print("three" + string.substring(1));
		} else if (firstLetter == '4') {
			string.substring(1);
			System.out.print("four" + string.substring(1));
		} else if (firstLetter == '5') {
			string.substring(1);
			System.out.print("five" + string.substring(1));
		} else if (firstLetter == '6') {
			string.substring(1);
			System.out.print("six" + string.substring(1));
		} else if (firstLetter == '7') {
			string.substring(1);
			System.out.print("seven" + string.substring(1));
		} else if (firstLetter == '8') {
			string.substring(1);
			System.out.print("eight" + string.substring(1));
		} else if (firstLetter == '9') {
			string.substring(1);
			System.out.print("nine" + string.substring(1));
		} else {
			System.out.print(string);
		}
	}
}
