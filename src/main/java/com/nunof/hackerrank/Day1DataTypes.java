package com.nunof.hackerrank;

//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.security.GeneralSecurityException;
//import java.util.regex.*;
//import java.util.stream.Collectors;



public class Day1DataTypes {
	
	
	void Solution(){
		
		int i = 0;
		double d = 4.0;
		String s = "cenas ";
		
		Scanner scan = new Scanner (System.in);
		
		int intVal = Integer.parseInt(scan.nextLine().trim());
		double doubleVal = Double.parseDouble(scan.nextLine().trim());
		String stringVal = scan.nextLine();
		
		scan.close();
		
		System.out.println(i + intVal);
		System.out.println(d + doubleVal);
		System.out.println (s + stringVal);	
		
		
	}
	

}
