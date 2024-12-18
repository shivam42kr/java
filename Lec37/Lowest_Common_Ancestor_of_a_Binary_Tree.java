package Lec37;

public class Lowest_Common_Ancestor_of_a_Binary_Tree {
//leetcode 236
	
   public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
  class Solution {
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
		 if(root == null) {
			 return null;
		 }
		 if(root == p || root == q) {
			 return root;
		 }
		 TreeNode left = lowestCommonAncestor(root.left, p, q);
		 TreeNode right = lowestCommonAncestor(root.right, p, q);
		 if(left != null && right != null) {
			 return root;
		 }
		 else if(left == null) {
			 return right;
		 }else {
			 return left;
		 }
	 }
  }
}
/*
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
*/
