package com.nunof.hackerrank;

import java.util.*; 

public class Exceptions {
    LinkedList<String> list;
    int[] intArray = new int[4];
    
    // For testing Null Pointer Exception
    Exceptions(){
        this.list = null;
    }
    
    // For testing Index Out of Bounds
    Exceptions(String str){
        this.list = new LinkedList<String>();
        list.add(str);
    }
    
    void exceptionDemo(int i, String str){
        
        try{
            // throws ArrayIndexOutOfBoundsException if index > intArray.length
            int myInt = intArray[i];
            
            // throws a NullPointerException if 'list' doesn't point to an actual list object
            list.indexOf(str);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println( "The following index is out-of-bounds: " + e.getMessage() );
        }
        catch(NullPointerException e){
            System.err.println( "Oh no! You tried to perform an operation on an object whose value is null!" );
        }
        finally{
            System.out.println("This is printing regardless of whether or not the program finishes executing.");
        }
        System.out.println("The program was able to continue execution!\n");
    }
}
