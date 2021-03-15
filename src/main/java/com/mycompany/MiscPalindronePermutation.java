package com.mycompany;

public class MiscPalindronePermutation {
	public static void main(String[] args) {
		System.out.println(palindronePermutation("input"));

		System.out.println(palindronePermutation("arcerac"));
		
		System.out.println(palindronePermutation("zddbbaaz"));
	}

	private static boolean palindronePermutation(String input) {
		int[] charCounts = new int[26];

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			charCounts[ch - 97] = charCounts[ch - 97] + 1;
		}
		

		boolean isEven = input.length() % 2 == 0;
		int countOf1s = 0;
		for (int x : charCounts) {
			if (x != 0) {
				if (isEven) {
					if (x != 2) {
						return false;
					}
				} else {
					if (x != 2 && x != 1) {
						return false;
					} else {
						if (x == 1) {
							countOf1s++;
						}
					}
				}
			}
		}

		if(!isEven && countOf1s != 1) {
			return false;
		}
		return true;
	}
}
