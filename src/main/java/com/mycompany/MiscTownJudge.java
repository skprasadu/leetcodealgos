package com.mycompany;

public class MiscTownJudge {

	public static void main(String[] args) {
		int n = 2;
		int [][]trust =  {{1,2}};
		
		System.out.println(findJudge( n ,  trust));
	}

	private static int findJudge(int n, int[][] trust) {
		// TODO Auto-generated method stub
		int[] count = new int[n+1];
		
		for(int[] t: trust) {
			count[t[0]] --;
			count[t[1]] ++;
		}
		
		for(int i = 1; i <= n; i++) {
			if(count[i] == n-1) {
				return i;
			}
		}
		
		return -1;
	}

}
