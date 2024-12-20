package Lec37;

public class Sum_Root_to_Leaf_Numbers {
//leetcode 129
	
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
		 public int sumNumbers(TreeNode root) {
		      return Numbers(root, 0);
		  }
		 public int Numbers(TreeNode root, int sum) {
			 if(root == null) {
				 return 0;
			 }
			 if(root.left == null && root.right == null) {
				 return sum * 10 + root.val;
			 }
			 int left = Numbers(root.left, sum * 10 + root.val);
			 int right = Numbers(root.right, sum * 10 + root.val);
			 return left + right;
		 }
    }
}
/*
Input: root = [1,2,3]
Output: 25
Explanation:
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.
Therefore, sum = 12 + 13 = 25.
*/
