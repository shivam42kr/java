package Lec34;
//leetcode 160
public class Intersection_of_Two_Linked_Lists {

	public class ListNode {
		    int val;
	        ListNode next;
	      ListNode(int x) {
            val = x;
	        next = null;
	      }
    }
   public class Solution {
	  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        ListNode y = headA;
	        ListNode vgf = headB;
	        while(y != vgf) {
	        	if(y == null) {
	        		y = headB;
	        	}else {
	        		y = y.next;
	        	}
	        	if(vgf == null) {
	        		vgf = headA;
	        	}else {
	        		vgf = vgf.next;
	        	}
	        }
	        return y;
	  }
   }

}
/*
Input: intersectVal = 2, listA = [1,9,1,2,4], 
                         listB = [3,2,4],
                         skipA = 3, skipB = 1
  Output: Intersected at '2'  
*/
