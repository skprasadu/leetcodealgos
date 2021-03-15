package com.mycompany.util;

public class LinkNode {
	
	public int val;
	public LinkNode next;
	
	public LinkNode(int n) {
		this.val = n;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		LinkNode head = this;
		
		StringBuffer sb = new StringBuffer();
		while(head != null) {
			sb.append(head.val + " -> ");
			head = head.next;
		}
		
		return sb.toString();
	}
}
