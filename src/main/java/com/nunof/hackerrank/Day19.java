package com.nunof.hackerrank;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
	int divisorSum(int n);
}

// 6 -> 1, 2, 3, 6 -> divisores de 6
class Calculator19 implements AdvancedArithmetic {
	
	public int divisorSum(int n){
				
		int resultSum = 0;
		
		for (int i=1; i<=n; i++) {
			resultSum += (n%i==0?i:0);
		}		
			
		return resultSum;
	}
	
}


public class Day19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator19(); 
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
		System.out.println(sum);
	}

}
