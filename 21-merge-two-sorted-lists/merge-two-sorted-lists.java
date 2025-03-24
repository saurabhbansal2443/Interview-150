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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        ListNode p1 = list1;
        ListNode p2 = list2;

        while (p1 != null || p2 != null) {
            int val1 = p1 != null ? p1.val : Integer.MAX_VALUE;
            int val2 = p2 != null ? p2.val : Integer.MAX_VALUE;

            if (val1 < val2) {
                dummy.next = new ListNode(val1);
                p1 = p1.next;
            } else {
                dummy.next = new ListNode(val2);
                p2 = p2.next;
            }
            dummy = dummy.next ; 
        }

        return ans.next ; 
    }
}