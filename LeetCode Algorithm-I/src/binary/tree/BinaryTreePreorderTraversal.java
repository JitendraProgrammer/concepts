package binary.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

	
	public static void main(String[] args) {
		
	}
	
	static class TreeNode {
		
		int val;
		TreeNode left ,right;
		TreeNode() {}
		TreeNode(int val) {this.val = val;}
		TreeNode(int val, TreeNode left, TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;}
	}
	
	// recursive method
	// preOrder Traversal
	public List<Integer> preOrderTraversal(TreeNode root){
		List<Integer> list = new ArrayList<>();
		if(root == null) 
			return list;
		//list.add(root.val);
		  return preOrder(list, root);
		/*
		 * pre.addAll(preOrder(root.left)); 
		 * pre.addAll(preOrder(root.right)); return list;
		 */
	}
	
	private List<Integer> preOrder(List<Integer> list, TreeNode root2) {
		
		if(root2 == null) {
			 return list;
		}
		   list.add(root2.val);
		   preOrder(list, root2.left);
		   preOrder(list, root2.right);
		     return list;
	}

	// preOrder Traversal
	  public List<Integer> inOrderTraversal(TreeNode root){
		  
		  List<Integer> list = new ArrayList<Integer>();
		  if(root == null) {
			  return list;
		  }
		   return inOrder(list, root);
	  }
	private List<Integer> inOrder(List<Integer> list, TreeNode node) {
		if(node == null) {
			  return list;
		  }
		inOrder(list, node.left);
		list.add(node.val);
		inOrder(list, node.right);
		  return list;
		
	}
	
	// postOrder Traversal
	public List<Integer> postOrderTraversal(TreeNode node){
		
		List<Integer> list = new ArrayList<Integer>();
		if(node == null) {
			return list;
		}
		  return postOrder(list, node);
		  
	}

	private List<Integer> postOrder(List<Integer> list, TreeNode node) {
		if(node == null) {
			return list;
		}
		postOrder(list, node.left);
		postOrder(list, node.right);
		list.add(node.val);
		  return list;
	}

}
