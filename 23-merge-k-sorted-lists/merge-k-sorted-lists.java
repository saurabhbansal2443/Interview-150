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
   
    public ListNode mergeKLists(ListNode[] list) {
        if(list.length == 0 ){
            return null ; 
        }else if( list.length == 1 ){
            return list[0]; 
        }

        ListNode ans  = mergeTwoLists(list[0],list[1]); 

        for(int i=2 ; i<list.length ; i++){
            ans = mergeTwoLists(ans , list[i]);
        }
        return ans ; 
    }

     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode dummy = new ListNode(-1);

        ListNode ans = dummy ; 

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                dummy.next = list1;
                dummy = dummy.next;
                list1 = list1.next;
            } else {
                dummy.next = list2;
                dummy = dummy.next;
                list2 = list2.next;
            }
        }

        if(list1 == null ){
            dummy.next = list2 ; 
        }else {
            dummy.next = list1 ; 
        }

        return ans.next ; 
    }
}