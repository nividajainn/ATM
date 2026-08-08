/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    ListNode a = headA;
    int lenA = 0;
    ListNode b = headB;
    int lenB = 0;
    
    while(a != null){
        a = a.next;
        lenA++;
    }
    while(b != null){
        b = b.next;
        lenB++;
    }

    // Move longer list ahead
        if(lenA > lenB) {
            int diff = lenA - lenB;

            while(diff > 0) {
                headA = headA.next;
                diff--;
            }
        }
        else {
            int diff = lenB - lenA;

            while(diff > 0) {
                headB = headB.next;
                diff--;
            }
        }           
   
        // Find intersection
        while(headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}