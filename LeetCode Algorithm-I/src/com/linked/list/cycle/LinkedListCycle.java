package com.linked.list.cycle;

import java.util.HashSet;
import java.util.Set;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		next = null;

	}

}

public class LinkedListCycle {

	public static void main(String[] args) {
		ListNode node = new ListNode(10);
		ListNode node1 = new ListNode(20);
		ListNode node2 = new ListNode(30);

		ListNode reverse = reverseList(node);

		System.out.println(reverse);

	}

// few test cases failed 
	public boolean hasCycle(ListNode node) {
		ListNode slowPointer = node;
		ListNode fastPointer = node.next;

		if (node == null || node.next == null) {
			return false;
		}
		while (fastPointer != null && fastPointer.next != null) {
			if (fastPointer == slowPointer) {
				return true;

			}
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}
		return false;

	}

// all the test cases passed!
	public boolean detectCycle(ListNode head) {
		if (head == null) {
			return false;
		}

		Set<ListNode> set = new HashSet<>();
		ListNode node = head;

		while (node != null) {
			if (set.contains(node)) {
				return true;
			}
			set.add(node);
			node = node.next;
		}

		return false;
	}

	// reverse linked List
	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode node = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return node;
	}

	// remove Duplicate from sorted list

	public ListNode deleteDuplicates(ListNode head) {

		ListNode curr = head;

		while (curr != null && curr.next != null) {
			if (curr.val == curr.next.val)
				curr.next = curr.next.next;
			else
				curr = curr.next;
		}

		return head;
	}

}
