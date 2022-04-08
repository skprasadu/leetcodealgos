package com.hcl.algobasics;

import java.util.Stack;

public class EliminateSubstring_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( getFinalString("AWAWSSG"));
	}
	
	private static String getFinalString(String s) {
	    Stack<Character> stack = new Stack<>();
	    
	    for(int i = 0; i < s.length(); i++) {
	    	stack.push(s.charAt(i));
    		int size = stack.size();
	    	if(size >= 3) {
	    		
	    		if(stack.get(size - 1 -2) == 'A' && stack.get(size - 1 -1) == 'W' 
	    				&& stack.get(size - 1 -0) == 'S' ) {
	    			stack.pop();
		            stack.pop();
		            stack.pop();
	    		}
	    	}
	    }
	    
	    String ans = "";
	    for (Character i : stack) {
	        ans += i;
	    }
	    if( ans == "") {
	        ans = "-1";
	    }
	    
	    return ans;
	}
}
