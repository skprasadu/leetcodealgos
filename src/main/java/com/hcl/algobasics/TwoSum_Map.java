package com.hcl.algobasics;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_Map {
	/**
	 * 
	 * @param args
	 * The problem statement is, given an input as 2, 12, 7, 5, 1,8, 10
	 * And total, as maybe 6
	 * return the index of 1st 2 number that sum to total i.e, 6
	 * 
	 * in this case what is the answer, {3,4}
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {  2, 12, 7, 5, 1,8, 10 };
		int target = 6;
		/*int[] ret = twoSum(data, target);
		System.out.println(ret[0] + " " + ret[1]);*/
		
		int[]ret = twoSum2(data, target);
		System.out.println("second method" + ret[0] + " " + ret[1]);
	}

	/*
	 * Approach 1: Brute force
	 * 
	 * What is the O(n sq) and this to be avoided
	 * n square complexity for 1000 number, 10000*10000 = 100000000
	 */
	private static int[] twoSum(int[] data, int target) {
		int[] ret = { -1, -1 };

		for(int i = 0; i < data.length; i++) {
			for(int j = i; j < data.length; j++) {
				if(data[i] + data[j] == target) {
					ret[0]=i;
					ret[1]=j;
				}
			}
		}

		return ret;
	}
	
	/*
	 * Approach 2:
	 * Can we use a HashMap approach? the cost of this is addational space
	 * 
	 * O(n) for 10000
	 */
	private static int[] twoSum2(int[] nums, int target) {
		/*Map<Integer, Integer> map = new HashMap<>();
		int[] ret = { -1, -1 };
		
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		System.out.println(map);
		
		for(int i = 0; i < nums.length; i++) {
			int complimentory = target - nums[i];
			System.out.println("***" + complimentory + " " + map.get(complimentory) + " " + i);
			
			if(map.get(complimentory) != null && map.get(complimentory) != i) {
				ret[0] = i;
				ret[1] = map.get(complimentory);
				break;
			} 
		} */
		
		Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println(numMap);
			System.out.println("***" + complement + " " + numMap.get(complement) + " " + i);

            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};		
	}
	
	/*
	 * 
	 */
	private static int[] twoSum3(int[] nums, int target) {
		return null;
	}
}
