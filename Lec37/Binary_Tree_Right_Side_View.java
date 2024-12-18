package Lec37;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Right_Side_View {
//leetcode 199
	
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
	    public List<Integer> rightSideView(TreeNode root) {
	    	List<Integer> ll = new ArrayList<>();
	    	View(root, 1, ll);
	    	return ll;
	    }
	    int maxDept = 0;
	    public void View(TreeNode root, int cl, List<Integer> ll) {
	    	if(root == null) {
	    		return;
	    	}
	    	if(maxDept < cl) {
//	    		System.out.println(root.val);
	    		ll.add(root.val);
	    		maxDept=cl;
	    		
	    	}
	    	View(root.right, cl + 1, ll);
	    	View(root.left, cl +1, ll);
	    }
	}
}
/*
 * Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]
*/
