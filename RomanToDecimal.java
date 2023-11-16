package cs176l;

// Sophia Ramirez Velandia and Ivan Martinez

import java.util.Scanner;

public class RomanToDecimal {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral between I and MMMCMXCIX (1 to 3999): ");
        String romanNumeral = scanner.nextLine();

        int decimalNumber = romanToInt(romanNumeral);
        if (decimalNumber < 1 || decimalNumber > 3999) {
            System.out.println("Number out of range or invalid Roman numeral.");
        } else {
            System.out.println("Decimal number: " + decimalNumber);
        }
        scanner.close();
    }

    public static int romanToInt(String s) {
        int[] decimalValues = {1, 5, 10, 50, 100, 500, 1000};
        char[] romanNumerals = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = getDecimalValue(s.charAt(i), romanNumerals, decimalValues);
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }
        return result;
    }

    public static int getDecimalValue(char romanChar, char[] romanNumerals, int[] decimalValues) {
        for (int i = 0; i < romanNumerals.length; i++) {
            if (romanChar == romanNumerals[i]) {
                return decimalValues[i];
            }
        }
        return 0;
    }
}