/**
206. Lista enlazada inversa 

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
    public ListNode reverseList(ListNode head) {
        ListNode anterior = null;  
        ListNode actual = head;
    
        
        while(actual != null) { 
            ListNode next = actual.next; 
            actual.next = anterior;
            anterior = actual;
            actual = next;
        }
       return anterior; 
    }
}