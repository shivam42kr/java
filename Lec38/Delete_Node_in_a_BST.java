package Lec38;

public class Delete_Node_in_a_BST {
//leetcode 450
	
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
	 }
   class Solution {
	    public TreeNode deleteNode(TreeNode root, int key) {
	    	if(root == null) {
	    		return null;
	    	}
	    	if(root.val < key) {
	    		root.right = deleteNode(root.right, key);
	    	}
	    	else if(root.val > key) {
	    		root.left = deleteNode(root.left, key);
	    	}
	    	//element milgya delete krna hai 
	    	else {
	    		//1 or 0 child
	    		if(root.left == null) {
	    			return root.right;
	    		}
	    		else if (root.right == null) {
	    			return root.left;
	    		}
	    		else {
	    			int m = max(root.left);
	    			root.left = deleteNode(root.left, m);
	    			root.val = m;
	    		}
	    	}
		   return root;     
		}
	    // maximum ka code
	    public int max(TreeNode root) {
	    	if(root == null) {
	    		return Integer.MIN_VALUE;
	    	}
	    	int r = max(root.right);
	    	return Math.max(r, root.val);
	    }
	    // minmum ka code
	    public int min(TreeNode root) {
	    	if(root == null) {
	    		return Integer.MAX_VALUE;
	    	}
	    	int r = min(root.left);
	    	return Math.min(r, root.val);
	    }
  }
}
