package cs176l;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		final int MIN = 0;
		final int MAX = 1000;		
        
        // Input first number
        System.out.print("Enter first positive number (0-1000): ");
        int number1 = number.nextInt();
        // Check if first number is a valid input
        while (number1 < MIN || number1 > MAX) {
        	System.out.print("Enter first positive number (0-1000): ");
        	number1 = number.nextInt();
        }
        
        // Input second number
        System.out.print("Enter second positive number (0-1000): ");
        int number2 = number.nextInt();
        // Check if second number is a valid input
        while (number2 < MIN || number2 > MAX) {
        	System.out.print("Enter second positive number (0-1000): ");
        	number2 = number.nextInt();
        }
        number.close();
        
        int gcd = 0;
        
        for(int i=1; i <= number1; i++) {
        	if(number1%i==0 && number2%i==0) {
        		gcd=i;
        	}
        }
     
        System.out.println("GCD(" + number1 + ", " + number2 + ") = " + gcd);
        
    }

}
