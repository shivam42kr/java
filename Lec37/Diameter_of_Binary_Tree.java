package Lec37;

public class Diameter_of_Binary_Tree {
//leetcode 543
	
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
	class Solution {   //tc -->0(n^2)
	    public int diameterOfBinaryTree(TreeNode root) {
	        return diameter(root);
	    }
	    
	    public int diameter(TreeNode root) {
	    	if(root == null) {
	    		return 0;
	    	}
	    	int ld = diameter(root.left);
	    	int rd = diameter(root.right);
	    	int sd = ht(root.left) + ht(root.right) + 2;
	    	return Math.max(sd, Math.max(rd, ld));
	    }
	   
		private int ht(TreeNode node) {
			if (node == null) {
				return -1;//ager ht 0 lenge to return -1 or 1 ht lenge to return 0
			}
			int lh = ht(node.left);
			int rh = ht(node.right);
			return Math.max(lh, rh) + 1;

		}
	}	
}
/*
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
*/
