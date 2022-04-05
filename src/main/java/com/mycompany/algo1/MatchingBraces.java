package com.mycompany.algo1;

import java.util.EmptyStackException;
import java.util.Stack;

public class MatchingBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(bracesMarched("{{}{}{}}")); // Should return true
		System.out.println("Stack method " + bracesMarched1("}{}{}{}{")); // Should return false
		System.out.println(bracesMarched("{}{}{}{")); // Should return false
		System.out.println(bracesMarched("{}}{{}"));
		System.out.println(bracesMarched("{{{{}}}{}{}}")); // Should return true
	}
	
	/*
	 * Approach1: Brute force is 2 counter approach, this is buggy
	 * 
	 * Approach2: 1 counter approach
	 * 
	 * Approach3: using Stack
	 */
	private static boolean bracesMarched1(String string) {
		//int braceCounter = 0;
		Stack<Character> stack = new Stack<>();
		
		//Push and Pop
		
		for(int i=0; i< string.length(); i++) {
			if(string.charAt(i) == '{') {
				//braceCounter++;
				stack.push('{');
			} else if(string.charAt(i) == '}') {
				//braceCounter--;
				try {
					stack.pop();
				} catch(EmptyStackException e) {
					return false;
				}
			}
		}
		
		//if(braceCounter == 0) {
		if(stack.empty()) {
			return true;
		}
		return false;
	}

	private static boolean bracesMarched(String string) {
		// TODO Auto-generated method stub
		// ArrayList or HashMap or Stack or Queue
		// Do we need a datastrucure at all??

		// There are 3 ways of solving this problem
		// Bad way: Keep 2 counters one for opening braces and one for closing brace.
		// If they are equal it will work, but this is buggy

		// Bad way 2: Add 1 when you see open brace and remove when you see close brace,
		// finally the counter is zero

		// Use Stack: When you see '{' push that to stack when you see '}' pop from
		// stack

		Stack<Character> stack = new Stack<>();
		try {
			for (int i = 0; i < string.length(); i++) {
				switch(string.charAt(i)) {
				case '{':
					stack.push('{');
					break;
				case '}':
					stack.pop();
					break;
				}
				
			}
		} catch (Exception e) {
			return false;
		}

		return stack.empty();
	}

}
