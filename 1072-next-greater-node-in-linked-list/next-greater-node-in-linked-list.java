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

    public int size(ListNode head){
        if(head == null )return 0 ; 
        ListNode ptr = head ; 
        int count = 0 ; 

        while(ptr != null ){
            ptr = ptr.next ; 
            count++ ; 
        }
        return count ; 
    }
    public ListNode reverseList(ListNode head) {

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
    public int[] nextLargerNodes(ListNode head) {


        
        int size = size(head); 
        int[] arr = new int[size];
        arr[size-1] = 0 ;  

        if(size == 1) return arr ; 

        ListNode nhead = reverseList(head); 

        Stack<Integer> st = new Stack<>(); 

        st.push(nhead.val ); 

        nhead = nhead.next ; 

        for(int i = size-2 ; i>=0 ; i--){
            int ele = nhead.val ; 
            nhead = nhead.next ; 

            while(st.size() > 0 && ele >= st.peek() ){
                st.pop(); 
            }

            if(st.size() == 0 ){
                arr[i] = 0 ; 
            }else{
                arr[i] = st.peek(); 
            }
            st.push(ele); 
        }

        return arr ; 
    }
}