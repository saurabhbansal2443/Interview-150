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

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode pre = null;

        while (curr != null) {
            ListNode nbr = curr.next;
            curr.next = pre;

            pre = curr;
            curr = nbr;
        }
        return pre;
    }

    public ListNode mid(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public boolean isPalindrome(ListNode head) {

        if ( head.next == null) {
            return true;
        }

        ListNode head1 = head ; 

        ListNode middle  = mid(head); 

        ListNode head2 = reverse(middle); 

        while(head1!= null && head2!=null){
            if(head1.val != head2.val){
                return false; 
            }
            head1 = head1.next ; 
            head2 = head2.next ; 
        }

        return true ; 


    }
}