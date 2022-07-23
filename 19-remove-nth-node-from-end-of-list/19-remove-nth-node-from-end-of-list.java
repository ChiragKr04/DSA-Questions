/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
		int llen = 0;
		
		while(temp!=null){
			temp = temp.next;
			llen ++;
		}
		
		int insertPosi = llen - n;
		
		temp = head;
		
		int currposi = 0;
		if(insertPosi == currposi){
			head = head.next;
			
		}else{
			while(currposi != insertPosi-1){
				currposi++;
				temp = temp.next;
			}
			temp.next = temp.next.next;		
			
		}
        return head;
    }
}