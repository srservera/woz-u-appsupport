package com.sierra.handson5;

public class HandsOn {

	public static void main(String[] args) 
		{
			  System.out.println("CREATE P1");
		        Person p1 = new Person();
		        System.out.println("P1 (no params) age = " + p1.getAge());
		}
}
	
		
		// 1. create a class called person 
		//with private member variables (attributes) 
			// first name, 
		//last name, 
		//age

       //2. create getter and setter methods 
       // to allow the first name, last name, and age to be access and modified 
       // getter and setter names should be camelCase (getFirstName) 

        //3. create 3 overload constructors to handle the following:
       // first name
        // first and last name 
       // fist name , last name, age 

       // check that age is a positive # (invalid value) 

		
		class Person {
			
		 private String firstName;
		 private String lastName;
		 private int age;
	
		 public Person() 
		 {
			 firstName = "";
			 lastName = "";
			 age = 0;
		 }
		 
		public Person(String firstName) 
		{
			this.firstName = firstName;
			lastName = "";
			age = 0;
		}
		public Person(String firstName, String lastName)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			age = 0;
		}
		public Person(String firstName, String lastName, int age)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			valAge();
		}
		//validate the age
		private void valAge()
		{
			age = 0;
			if (age < 0) 
			{
		       System.out.print("Invalid value of age was entered.");
			}
		}
		// getters & setters
		public String getFirstName() 
	     {
	       return firstName;
	     }
		 
		public void setFirstName()
           {
	      this.firstName = firstName;
	       
           }
		public String getLastName() 
		{
			return lastName;
		}
		public void setLastName()
		{
			this.lastName = lastName;
		}
		public int getAge() 
		{
			return age;
		}
		public void valAge(int newAge)
		{
			this.age =age ;
			valAge();
	
		
		}
}

	
