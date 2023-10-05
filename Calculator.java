package cs176l;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner calculator = new Scanner(System.in);
		
		System.out.print("Enter first integer number: ");
		int number1 = calculator.nextInt();
		
		System.out.print("Enter operator( + , -, *, / ): ");
		String operator = calculator.next();
		
		System.out.print("Enter second integer number: ");
		int number2 = calculator.nextInt();
		
		if(operator.equals("+")) {
			int add;
			add = number1+number2;
			System.out.printf("The result(by adding) is: " + add);
		} else if(operator.equals("-")) {
			int less;
			less =  number1 - number2;
			System.out.printf("The result(by substracting) is: " + less);
		} else if(operator.equals("*")) {
			int multiply;
			multiply =  number1 * number2;
			System.out.printf("The result(by multiplying) is: " + multiply);
		} else if(operator.equals("/")) {
			int divided;
			divided =  number1 / number2;
			System.out.printf("The result(by dividing) is: " + divided);
		} else {
			System.out.print("Is not a valid operator!");
		}

	}

}
