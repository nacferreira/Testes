package com.nunof.hackerrank;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	Difference(int[] arr){
  		this.elements = arr;  		
  	}
  	
  	void computeDifference(){
  		maximumDifference = 0;
  		for(int i= 0; i<elements.length-1; i++) {
  			for(int j=i+1; j<elements.length; j++){
  				if(Math.abs(elements[i]-elements[j]) > maximumDifference) maximumDifference = Math.abs(elements[i]-elements[j]);	
  			}
  			
  		}
  	}
}