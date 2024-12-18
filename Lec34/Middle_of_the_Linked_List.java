package Lec34;

public class Middle_of_the_Linked_List {
       // 876 leetcode
	
	public class ListNode {
		  int val;
		  ListNode next;
          ListNode() {
        	  
          }
          ListNode(int val) {
        	  this.val = val; 
          }
	    ListNode(int val, ListNode next) { 
	    	this.val = val;
	    	this.next = next; 
	    }
	 }
	
  class Solution {
        public ListNode middleNode(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;
	        while(fast != null && fast.next != null) {
	        	slow = slow.next;
	        	fast = fast.next.next;
	        }
	        return slow;
	    }
   }
}
/*
   Input: head = [1,2,3,4,5]
   Output: [3,4,5]
 */
