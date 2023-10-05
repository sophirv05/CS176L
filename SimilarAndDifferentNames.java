package cs176l;

import java.util.Scanner;

public class SimilarAndDifferentNames {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String name1 = name.next();
		
		System.out.print("Enter second name: ");
		String name2 = name.next();
		
		if(name1.equals(name2)){
			System.out.print("The names are the same! The name is: "+name1);
		} else {
			System.out.print("Name1 and name2 are different! Name 1 is: "+name1+ " and Name2 is: "+name2);
		}
		
	}
}
