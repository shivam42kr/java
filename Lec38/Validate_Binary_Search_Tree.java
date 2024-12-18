package Lec38;

public class Validate_Binary_Search_Tree {
//	leetcode 98
	
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
	   public boolean isValidBST(TreeNode root) {
	        return ValidBST(root).isbst;
	   }
	   public BstPair ValidBST(TreeNode root) {
		   if(root == null) {
			   return new BstPair();
		   }
		   BstPair lbstp = ValidBST(root.left);
		   BstPair rbstp = ValidBST(root.right);
		   
		   BstPair sbstp = new BstPair();
		   sbstp.min = Math.min(root.val, Math.min(lbstp.min, rbstp.min));
		   sbstp.max = Math.max(root.val, Math.max(lbstp.max, rbstp.max));
		   sbstp.isbst = lbstp.isbst && rbstp.isbst && lbstp.max < root.val && rbstp.min > root.val;
		   return sbstp;
	   }
	   class BstPair{
		   boolean isbst = true;
		   long min = Long.MAX_VALUE;
		   long max = Long.MIN_VALUE;
	   }
   }

}
/*  this code second type 
 * 
BstPair sbstp = new BstPair();
if(lbstp.isbst == true && rbstp.isbst == true && lbstp.max < root.val && rbstpmin > root.val) {
	sbstp.isbst = true;
	sbstp.max = Math.max(rbst.max, root.val);
	sbstp.min = Math.min(lbst.max, root.val);
	return sbst;
}
sbstp.isbst = true;
sbstp.min = Math.min(root.val, Math.min(lbstp.min, rbstp.min));
sbstp.max = Math.max(root.val, Math.max(lbstp.max, rbstp.max));
return sbstp;  */
