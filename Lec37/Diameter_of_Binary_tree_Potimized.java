package Lec37;

public class Diameter_of_Binary_tree_Potimized {

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
	    public int diameterOfBinaryTree(TreeNode root) {
	        return diameter(root).dia;
		}	    
	    public DiaPair diameter(TreeNode root) {
	    	if(root == null) {
	    		return new DiaPair();
	    	}
	    	DiaPair ldp = diameter(root.left);
	    	DiaPair rdp = diameter(root.right);
	    	DiaPair sdp = new DiaPair();
	    	int sd = ldp.ht + rdp.ht + 2;
	    	sdp.ht = Math.max(sd, Math.max(rdp.dia, ldp.dia));
	    	return sdp;
	    }
	    class DiaPair{
	    	int dia = 0;
	    	int ht = -1;
	    }
   }
}
