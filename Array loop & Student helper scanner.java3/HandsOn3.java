package com.sierra.handson3;

public class HandsOn3 {

	public static void main(String[] args) {
		// declare and array of size 5
		// create a for loop
		// access and print the 5 values 
		// access and print the 5 values in reverse order 
		// access and print the odd 5 values 
		
       int [] numbers = {0, 0, 0, 0, 0};
       for (int i = 0; i < numbers.length; i++)
       {
    	   System.out.println("Enter a number: ");
    	  numbers[i] = StudentHelper.ReadInputInt();
       }
       
       System.out.println("Array contents:");
       for(int num: numbers) {
    	   System.out.println(num);
       }
       
       System.out.println("Array contents in reverse:");
       for(int i = numbers.length-1;i>=0; i--) {
    	   System.out.println(numbers[i]);
       }
       
       System.out.println("Array where the contents are odd:");
       for(int i = 0; i < numbers.length; i++ ) {
    	   System.out.println(numbers[i] %2);
       }
       
	

}
}
