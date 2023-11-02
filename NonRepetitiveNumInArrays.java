package cs176l;

import java.util.Scanner;

public class NonRepetitiveNumInArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	     System.out.print("Enter the number of elements in the array: ");
	     int size = scanner.nextInt();
	     int[] array = new int[size];
	     
	     System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	     }
	     
	     int firstNonRepeatingNumber = -100;
	     
	     for(int i = 0; i < array.length; i++) {
	       	 boolean isUnique = true;
	       	 for(int x = 0; x < array.length; x++) {
	       		 if (i != x && array[i] == array[x]) {
	       			 isUnique = false;
	       			 break;
	       		 }
	       	 } 
	       	 if (isUnique && firstNonRepeatingNumber ==-100) {
	       		firstNonRepeatingNumber = array[i];
	       	 }
	     }
	     
	     
	     if(firstNonRepeatingNumber != -1) {
	    	 System.out.println("The first non repetitive number is " + firstNonRepeatingNumber);
	     } else {
	    	 System.out.println("There are not non repetitive numbers");
	     }
	     
	     scanner.close();

	}

}
