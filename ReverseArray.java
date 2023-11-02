package cs176l;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner numbers = new Scanner(System.in);
		System.out.println("Please input the size of array: ");		
		int size = numbers.nextInt();
	    
		int[] num = new int [size];
		
		Scanner integers = new Scanner(System.in);
	    System.out.println("Please input  " + num.length + " integer numbers");
		
	    for (int i=0; i<size ; i++){
	        System.out.print("Index " + i + ": ");     
	        num[i] = numbers.nextInt(); 

	    }
	    
		System.out.println("Reverse list:");
		for (int i = size-1; i>=0; i--){
	         System.out.println ("reverse[" + i + "]=" + num[i] );   
	    }
		numbers.close();
		integers.close();
	}

}
