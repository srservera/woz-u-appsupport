package com.sierra.handson2;

public class HandsOn2 {

	public static void main(String[] args) 
	{
		// if age 65 > ticket is $7
		// if age 12 > ticket $8
		//else ticket is $10
		
		//System.out.println("Enter user age to determine price of ticket: ");
		// System.readLine();
		
		int age = -9;
		
		boolean isStudent = true;		
		
		if (age < 0 )
		{
			System.out.println("Invalid age");
			return;
		}
		
	if (age >= 65 )
			{
			System.out.println("Your ticket cost $7");
			}
		else if (age <= 12)
			{
			System.out.print("Your ticket is $8");
			}
		else if (isStudent)
			{
				System.out.print("You pay $8");
			}
		else 
			{
			System.out.print("Your ticket is $10");
			}
	}

}
