package com.mycompany.algo1;

import java.util.HashSet;
import java.util.Set;

public class ProductData {

	/*
	 * Let us say, you have 3 inputs, I want to find, how many of them 
	 * have duplicates, you need to return count
	 * String[] pNames  = {"zen", 	"ipx", 	"n797", "ipx", 	"ip6"};
	 * double[] prices  = {1.2, 	2.0, 	3.0, 	2.0, 	2.0};
	 * String[] vendors = {"smsg", 	"appl", "nok", 	"appl", "appl"};
	 * 
	 * assumption is all the 3 arrays have same size
	 * output is an integer that is, in this case, 
	 * ipx, 2.0, appl, there is one duplicate, so the count is 1.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pNames  = {"zen", 	"ipx", 	"n797", "ipx", 	"ip6"};
		double[] prices  = {1.2, 	2.0, 	3.0, 	2.0, 	2.0};
		String[] vendors = {"smsg", "appl", "nok", 	"appl", "appl"};
		
		System.out.println( duplicateCount( pNames, prices, vendors));
	}
	
	public static int duplicateCount(String[] pNames, double[] prices, 
			String[] vendors) {
		
		Set<String> set = new HashSet<>();
		
		int count = 0;
		for(int i=0; i < pNames.length; i++) {
			String temp = pNames[i] + "&" + prices[i] + "&" + vendors[i];
			
			if(!set.add(temp)) {
				count++;
			} 
		}
		
		System.out.println(set);

		return count;
	}

}
