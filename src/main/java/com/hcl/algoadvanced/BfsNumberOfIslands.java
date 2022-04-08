package com.hcl.algoadvanced;

public class BfsNumberOfIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] islands = {
				{1,1,1,1,0}, 
				{1,1,0,1,0}, 
				{1,1,0,0,0}, 
				{0,0,0,0,0}};
		
		int count = solve(islands);
		
		System.out.println(count);
	}

	private static int solve(int[][] islands) {
		int count = 0;
		for(int i = 0; i < islands.length; i++) {
			for(int j = 0; j < islands[i].length; j++) {
				if(islands[i][j] == 1 ) {
					count++;
					bfs(islands, i, j);
				}
			}
		}
		return count;
	}

	private static void bfs(int[][] islands, int i, int j) {
		// TODO Auto-generated method stub
		if(i < 0 || i > (islands.length -1) || j < 0 || j > (islands[i].length -1) || islands[i][j] == 0) {
			return;
		}
		
		islands[i][j] = 0;
		
		bfs(islands, i+1, j);
		bfs(islands, i-1, j);
		bfs(islands, i, j+1);
		bfs(islands, i, j-1);
	}

}
