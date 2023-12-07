package cs176l;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class NegativeNumChecker {

	public static void main(String[] args) {
        System.out.println("Negative Number Checker!");
        try {
            File file = new File("checkNumbers.txt"); // file to check the numbers
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                int number = Integer.parseInt(scanner.nextLine());
                if (number > 0) {
                    throw new PositiveNumException("Positive number found: " + number);
                }
            }
            scanner.close();
            System.out.println("No positive numbers found!");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (PositiveNumException e) {
            System.err.println("Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

class PositiveNumException extends Exception {
    private static final long serialVersionUID = 1L;

    public PositiveNumException(String message) {
        super(message);
    }

}
