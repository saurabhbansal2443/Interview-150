/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)
            return l1 == null ? l2 : l1;

        ListNode ptr1 = l1;
        ListNode ptr2 = l2;

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        int carry = 0;

        while (ptr1 != null || ptr2 != null) {
            int val1 = ptr1 != null ? ptr1.val : 0;
            int val2 = ptr2 != null ? ptr2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            ListNode nbr = new ListNode(digit);

            dummy.next = nbr;
            dummy = dummy.next;

            if (ptr1 != null)
                ptr1 = ptr1.next;
            if (ptr2 != null)
                ptr2 = ptr2.next;

        }

        if(carry > 0 ){
            ListNode nbr = new ListNode(carry);
            dummy.next = nbr;
        }

        return ans.next ; 

    }
}