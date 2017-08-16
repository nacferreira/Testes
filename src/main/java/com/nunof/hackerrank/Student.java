package com.nunof.hackerrank;

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	
	Student(String firstName, String lastName, int identification, int[] scores){
		super(firstName, lastName, identification);
		this.testScores = scores;		
	}

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	public char calculate() {
		int average = 0;
		char grade = ' ';
		for (int i = 0; i<testScores.length; i++) {
			average += testScores[i];
		}
		
		average = average / testScores.length;
		
		if (average < 40) grade = 'T';
		else if (average < 55) grade = 'D';
			else if (average < 70) grade = 'P';
				else if (average < 80) grade = 'A';
					else if (average < 90) grade = 'E';
						else grade = 'O';
		
		return grade;
	}
}