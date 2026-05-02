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
    public ListNode mergeNodes(ListNode head) {
       
       int sum = 0 ; 

       ListNode dummy = new ListNode(-1); 
       ListNode ans = dummy ; 

       ListNode ptr = head.next ; 

       while(ptr != null ){
           
           if(ptr.val != 0 ){
            sum+=ptr.val ; 
           }else{
            ListNode n = new ListNode(sum); 
            dummy.next = n ; 
            dummy = dummy.next ; 
            sum = 0 ; 
           }
           ptr = ptr.next ; 
       }

       return ans.next ; 
    }
}