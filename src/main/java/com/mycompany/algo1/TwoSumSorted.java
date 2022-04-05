package com.mycompany.algo1;

public class TwoSumSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Upfront sort the array - This is one time cost
		//one disadvantage is you will loose the original indexes
		int[] data = { 1, 2, 5, 7, 8, 10, 12 };
		int target = 6;
		
		int[] ret = twoSum(data, target);
		System.out.println(ret[0] + " " + ret[1]);
	}

	/*
	 * 2 pointer approach
	 */
	private static int[] twoSum(int[] data, int target) {
		int i = 0, j = data.length - 1;
		int[] ret = { -1, -1 };

		while (i < j) {
			int sum = data[i] + data[j];
			if (sum < target) {
				i++;
			} else if (sum > target) {
				j--;
			} else {
				ret[0] = i;
				ret[1] = j;
				return ret;
			}
		}

		return ret;
	}

}
