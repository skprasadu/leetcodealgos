package com.hcl.algoadvanced;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BfsAverageAtEachLevelOfGraph {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(27);
		
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		System.out.println(getAverage(root));
	}

	private static List<Double> getAverage(TreeNode root) {
		// TODO Auto-generated method stub
		List<Double> result = new ArrayList<>();
		
		LinkedList<TreeNode> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			int count = queue.size();
			
			double sum = 0;
			
			TreeNode p;
			
			for(int i =0; i < count; i++) {
				p = queue.poll();
				
				sum += p.val;
				
				if(p.left != null) {
					queue.add(p.left);
				}
				if(p.right != null) {
					queue.add(p.right);
				}
			}
			
			result.add(sum/ count);
			
		}
		return result;
	}

	static class TreeNode {
		int val;
		
		TreeNode left;
		TreeNode right;
		TreeNode(int val) {
			this.val = val;
		}
	}
}
