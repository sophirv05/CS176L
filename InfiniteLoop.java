package cs176l;

import java.util.Scanner;

public class InfiniteLoop {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name1 = name.nextLine();
		
		while (true) {
			System.out.println(name1);
		}
	}
	
}
