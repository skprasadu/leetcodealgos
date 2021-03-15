package com.mycompany;

import java.util.Arrays;

public class SortContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 1, 2, 7, 3, 8, 199, 111, 2 };

		System.out.println(containsDup(data));
	}

	private static boolean containsDup(int[] data) {
		Arrays.sort(data);

		int prev = data[0];

		for (int i = 1; i < data.length; i++) {
			if (prev == data[i]) {
				return false;
			}
			prev = data[i];
		}
		return true;
	}

}
