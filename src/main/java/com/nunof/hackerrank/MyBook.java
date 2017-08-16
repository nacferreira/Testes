package com.nunof.hackerrank;

//Declare your class here. Do not use the 'public' access modifier.
//Declare the price instance variable

/**   
 *   Class Constructor
 *   
 *   @param title The book's title.
 *   @param author The book's author.
 *   @param price The book's price.
 **/
//Write your constructor here

public class MyBook extends Book {

	int price;

	public MyBook(String title, String author, int price){
		super(title, author);
		this.price = price;
	}

	/**   
	 *   Method Name: display
	 *   
	 *   Print the title, author, and price in the specified format.
	 **/
	void display() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Price: " + this.price);
	}

}



