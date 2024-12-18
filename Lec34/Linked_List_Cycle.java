package Lec34;
// leet code 141
public class Linked_List_Cycle {
	
	class ListNode {
		     int val;
		     ListNode next;
		     ListNode(int x) {
		          val = x;
		          next = null;
		     }
	 }
	
	class Solution {
	    public boolean hasCycle(ListNode head) {
	        ListNode slow = head;
		    ListNode fast = head;
		    while(fast != null && fast.next != null) {
		        slow = slow.next;
		        fast = fast.next.next;
		        if(slow == fast) {
		        	return true;
		        }
		    }
		        return false;
		 }
	}
}
/*
  Input: head = [3,2,0,-4], pos = 1
   Output: true
 */
