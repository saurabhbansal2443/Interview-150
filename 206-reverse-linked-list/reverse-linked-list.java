/**
 * Definition for singly-linked list.
 * public class 
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // 1) Empty LinkedList 
        // 2) LinkedList With one Node 
        // 3) Even length LL 
        // 4) Odd length LL 

        if(head == null  || head.next == null ){
            return head ; 
        }


        ListNode curr = head ; 
        ListNode prev = null ; 

        while(curr!= null ){
            ListNode nbr = curr.next ; 
            curr.next = prev ; 

            prev = curr ; 
            curr = nbr ; 
        } 

        return prev ; 
    }
}