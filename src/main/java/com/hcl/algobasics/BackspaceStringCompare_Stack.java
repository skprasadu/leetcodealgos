package com.hcl.algobasics;

import java.util.Stack;
import java.util.stream.Collectors;

public class BackspaceStringCompare_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "axx#bb#c";
		System.out.println(backspace(s1));

		String s2 = "axbd#c#c";
		System.out.println(backspace(s2));
	}

	private static String backspace(String s1) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '#') {
				stack.pop();
			} else {
				stack.push(s1.charAt(i));
			}
		}
		return stack.stream().map(a -> a.toString()).collect(Collectors.joining(""));
	}

}
