package com.hcl.algobasics;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_NSqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {  2, 12, 7, 5, 1,8, 10 };
		int target = 6;
		int[] ret = twoSum(data, target);
		System.out.println(ret[0] + " " + ret[1]);
		
		ret = twoSum2(data, target);
		System.out.println(ret[0] + " " + ret[1]);
	}

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
	
	private static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }

}
