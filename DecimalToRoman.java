package cs176l;

//Sophia Ramirez Velandia and Ivan Martinez

import java.util.Scanner;

public class DecimalToRoman {
	
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number between 1 and 3999: ");
	        int number = scanner.nextInt();
	        
	        final int lowest = 1;
			final int highest = 3999;
			
			if (number < lowest || number > highest) {
	            System.out.println("Number out of range!");
	        } else {
	            String romanNumeral = convertToRoman(number);
	            System.out.println("Roman numeral: " + romanNumeral);
	        }
			scanner.close();
	}
	public static String convertToRoman(int num) {
        int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();
        int x = 0;
        while (num > 0) {
            while (num >= decimalValues[x]) {
                num -= decimalValues[x];
                roman.append(romanSymbols[x]);
            }
            x++;
        }
        return roman.toString();
    }

}
