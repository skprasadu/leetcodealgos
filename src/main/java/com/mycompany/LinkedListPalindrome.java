package com.mycompany;

import com.mycompany.util.LinkNode;

public class LinkedListPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkNode head = new LinkNode(1);
		head.next = new LinkNode(2);
		head.next.next = new LinkNode(2);
		head.next.next.next = new LinkNode(1);
		
		System.out.println(head);
		System.out.println(isPalindrome(head));
		
		head = new LinkNode(1);
		head.next = new LinkNode(2);
		head.next.next = new LinkNode(2);
		head.next.next.next = new LinkNode(2);
		
		System.out.println(head);
		System.out.println(isPalindrome(head));

	}

	private static boolean isPalindrome(LinkNode head) {
		// TODO Auto-generated method stub
		LinkNode fast = head;
		LinkNode slow = head;
		
		while(fast != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		LinkNode secondHalf = reversed(slow);
		
		System.out.println(secondHalf);
		while(secondHalf != null) {
			if(secondHalf.val != head.val) {
				return false;
			}
			secondHalf = secondHalf.next;
			head = head.next;
		}
		return true;
	}

	private static LinkNode reversed(LinkNode fast) {
		// TODO Auto-generated method stub
		
		LinkNode head = fast;
		LinkNode prev = null;
		
		while(head != null) {
			LinkNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		
		return prev;
	}

}
