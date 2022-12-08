package com.maximum.depth.binary;

class Node {
	int val;
	Node left, right;

	Node(Node left, Node right, int val) {
		this.left = left;
		this.right = right;
		this.val = val;
	}

	Node(int val) {
		this.val = val;

	}
}

	public class MaximumDepthBinary {
		Node root;
	public int findMaximumDepthBinary(Node node) {
		if (node == null) {
			return 0;
		} else {
			int lDepth = findMaximumDepthBinary(node.left);
			int rDepth = findMaximumDepthBinary(node.right);

			if (lDepth > rDepth) { 
				return (lDepth) + 1;
			} else
				return (rDepth) + 1;
		}

	}
	  public static void main(String[] args) {
	
			MaximumDepthBinary tree = new MaximumDepthBinary();
			tree.root = new Node(7);
			tree.root.left = new Node(8);
			tree.root.right = new Node(9);
			tree.root.left.left = new Node(10);
			tree.root.left.right = new Node(11);
			
			System.out.println("height of binary tree:" + tree.findMaximumDepthBinary(tree.root));
			
	}
	  }
	


	

