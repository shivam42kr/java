package Lec38;

public class Insert_into_a_Binary_Search_Tree {
//leetcode 701
	
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
	   public TreeNode insertIntoBST(TreeNode root, int val) {
	        if(root == null) {
	        return new TreeNode(val);
	        }
		   if(root.val < val) {
			   root.right = insertIntoBST(root.right, val);
		   }else {
			   root.left = insertIntoBST(root.left, val);
		   
	    }
		   return root; // address wapas ja raha h
	   }
  }
}
/*
 * Input: root = [4,2,7,1,3], val = 5
Output: [4,2,7,1,3,5]
*/
