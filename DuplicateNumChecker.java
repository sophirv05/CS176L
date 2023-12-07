package cs176l;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateNumChecker {
	public static void main(String[] args) {
		System.out.println("Duplicate Number Checker!");
        Scanner duplicate = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers:");
        while (duplicate.hasNextInt()) {
            int number = duplicate.nextInt();
            if (numbers.contains(number)) {
                try {
                    throw new DuplicateNumException("Duplicate number found: " + number);
                } catch (DuplicateNumException e) {
                    System.err.println("Exception: " + e.getMessage());
                    return; // Exit the program if there a douplicate number
                }
            }
            numbers.add(number);
        }
        System.out.println("There are not duplicates numbers found");
        duplicate.close();
    }
}

	class DuplicateNumException extends Exception {
		private static final long serialVersionUID = 1L;

		public DuplicateNumException(String message) {
			super(message);
		}
}
