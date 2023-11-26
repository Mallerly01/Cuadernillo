//ejercicio de pilas, verificar si es palíndromo o no.

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
    public boolean isPalindrome(ListNode head) {
        if (head==null){
            return false;
        }

        ListNode nodoActual = head;
        ListNode nuevo = new ListNode();

        while (nodoActual!=null){
            ListNode temp = new ListNode(nodoActual.val);
            temp.next = nuevo;
            nuevo = temp;
            nodoActual = nodoActual.next;
        }
        nodoActual = head;

        while (nodoActual!=null){
            if (nodoActual.val!=nuevo.val){
                return false;
            }
            nodoActual = nodoActual.next;
            nuevo = nuevo.next;
        }
        return true;
    }
}