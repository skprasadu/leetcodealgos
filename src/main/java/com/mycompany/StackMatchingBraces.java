package com.mycompany;

import java.util.Stack;

public class StackMatchingBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(matchingBraces("{{}{}{}}"));
		
		System.out.println( matchingBraces("{{}{}{}"));
		
		System.out.println( matchingBraces("}{}{}{}{"));
	}

	private static boolean matchingBraces(String string) {
		// TODO Auto-generated method stub
		char[] braces = string.toCharArray();
		
		int rightCounter = 0;
		//int leftCounter = 0;
		
		Stack <Character> stack = new Stack<>();
		
		for(int i = 0; i < braces.length; i++) {
			if(braces[i] == '{') {
				stack.push('{');
			} 
			if(braces[i] == '}') {
				stack.pop();
			}
		}
		
		return stack.isEmpty();
	}

}
