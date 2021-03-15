
package com.mycompany;

import java.util.ArrayList;
import java.util.List;

public class MiscPascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( generatePascalsTriangle(6));
	}

	private static List<List<Integer>> generatePascalsTriangle(int numRows) {
		// TODO Auto-generated method stub
		List<List<Integer>> triangle = new ArrayList<>();
		List<Integer> firstRow = new ArrayList<>();
		
		firstRow.add(1);
		triangle.add(firstRow);
		
		for(int i = 1; i < numRows; i++) {
			List<Integer> prevRow = triangle.get(i - 1);
			List<Integer> row = new ArrayList<>();
			row.add(1);
			
			for(int j = 1; j < i; j++) {
				row.add(prevRow.get(j-1) + prevRow.get(j));
			}
			
			row.add(1);
			
			triangle.add(row);
		}
		
		return triangle;
	}

}
