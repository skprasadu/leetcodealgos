package com.hcl.algobasics;

import java.util.HashMap;
import java.util.Vector;

public class MaxRepeatingChars {

	/*
	 * Return index of 1 occurrence of maximum occurring character in an input string.
	 * 
	 * For example let us say we pass a string to this function called, ‘aaafbbbdeeeda’, you need to return the 1st index of maximum character, 
	 * in this case it is ‘a’ and first index is ‘0’
	 * 
	 * Next example, ‘eeddfssses’, the value is ‘s’ and the first index is, ‘5’.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList or HashMap or Stack...
		// aaafbbbdeeeda => { 'a': 4, 'f': 1, 'b': 3, 'e': 3 } , a => 0
		
		System.out.println(maxOccuringCharIndex("aaafbbbdeeeda"));
		System.out.println(maxOccuringCharIndex("aafbbbdeeed"));
	}
	
	
	
	public static String maxOccuringCharIndex(String input) {
		char curChar = input.charAt(0);
		int count = 1;
		String output = "";
	    for(int i = 1; i < input.length(); i++){
	        if(input.charAt(i) == curChar){ 
	        	count++;
	        } else {
	        	if(count > 1) {
	        		output += curChar;
	        		output += count;
	        	} else {
	        		output += curChar;
	        	}
	        	//reset
	        	count = 1;
	        	curChar = input.charAt(i); 
	        }
	    }
	    
	    if(count > 1) {
    		output += curChar + count;
    	} else {
    		output += curChar;
    	}
	    return output;
	}

}
