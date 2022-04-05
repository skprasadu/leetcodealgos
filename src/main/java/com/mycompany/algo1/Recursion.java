package com.mycompany.algo1;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fact(4));
		
		System.out.println(fact1(4));

	}

	private static int fact(int n) {
		System.out.println("value=" + n);
		if (n <= 1) // base case
			return 1;
		else
			return n * fact(n - 1);
	}
	
	private static int fact1(int n) {
		int sum = 1;
		for(int i = n; i >=1; i--) {
			System.out.println("value=" + i);
			sum *= i;
		}
		
		return sum;
	}

}
