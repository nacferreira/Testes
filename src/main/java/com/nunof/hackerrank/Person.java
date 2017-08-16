package com.nunof.hackerrank;

public class Person {
	
	private int age;
	
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	public Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	
	public Person(int initialAge){
				
		if(initialAge>0) { 
			age = initialAge;
		}
		else {
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}	
	}
	
	public void yearPasses(){
		age++;
	}
	
	public void amIOld() {
		if(age<13) {
			System.out.println("You are young.");
		}
		else {
			if(age >= 13 && age < 18) {
				System.out.println("You are a teenager.");
			}
			else{
				System.out.println("You are old.");
			}
				
		}
			
		
	}

}
