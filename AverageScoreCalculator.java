package cs176l;

import java.util.Scanner;

public class AverageScoreCalculator {

	public static void main(String[] args) {
		Scanner calculator = new Scanner(System.in);
		
		System.out.print("What is you name: ");
		String name1 = calculator.nextLine();
		
		System.out.printf("Hello " + name1 + "! How many exams have you taken? ");
		int numberExams = calculator.nextInt();
		
		int count = 1;
		double total = 0;
		final int lowest = 0;
		final int highest = 100;
		
		while(numberExams >= count) {
			Scanner score = new Scanner(System.in);
			System.out.print("Give me the score of exam " + count + ": ");
			double exam = score.nextInt();
			if (exam >= lowest && exam <= highest) {
				count++;
				total += exam;
				
			} else {
				System.out.println("Invalid score! Please give me the score of exam " + count);
			}
		}
		double average= (total/numberExams);
		System.out.printf("Hi " + name1 + ", your average score of " + numberExams + " exams is " + average);
	}

}
