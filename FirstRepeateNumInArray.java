package cs176l;

import java.util.Scanner;

public class FirstRepeateNumInArray {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	     System.out.print("Enter the number of elements in the array: ");
	     int size = scanner.nextInt();
	     int[] array = new int[size];
	     
	     System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	     }
	        
	     int firstIntex = -1;
	     int firstRepeatingNumber = -1;
	     
	     for(int i = 0; i < array.length; i++) {
	    	 for(int x = i+1; x < array.length; x++) {
	    		 if (array[i] == array[x] && firstRepeatingNumber==-1) {
	    			 firstIntex = x;
	    			 firstRepeatingNumber = array[x];
	    		 }
	    	 } 
	     }
	     
	     if(firstRepeatingNumber != -1) {
	    	 System.out.println("The first repetitive number is " + firstRepeatingNumber);
	     } else {
	    	 System.out.println("There are not any repetitive numbers");
	     }
	     
	     scanner.close();
		

	}

}
