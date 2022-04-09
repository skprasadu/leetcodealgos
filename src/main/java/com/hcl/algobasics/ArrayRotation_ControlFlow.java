package com.hcl.algobasics;

/*
 * In this post, we will see how to left-rotate an array 
 * by specified positions. For example, left-rotating array 
 * { 1, 2, 3, 4, 5 } twice results in array { 3, 4, 5, 1, 2 }.
 */
public class ArrayRotation_ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 3, 2, 4, 1, 9, 6 };
		int rotCount = 2;

		int[] out = rotate(array, rotCount);
	}

	private static int[] rotate(int[] arr, int rotCount) {
		int[] out = new int[arr.length];

		int d = (rotCount % arr.length);

		for (int i = 0; i < arr.length; i++) {
			int rotIndex = d + i;
			int curIndex = rotIndex;

			if (rotIndex > (arr.length - 1)) {
				curIndex = rotIndex - arr.length;
			}
			out[curIndex] = arr[i];
		}
		return out;
	}
}
