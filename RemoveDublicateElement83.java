/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode current = head;

        while (current != null && current.next != null) {

            if (current.val == current.next.val) {
                current.next = current.next.next;
            } 
            else {
                current = current.next;
            }
        }

        return head;
    }
*/
}import java.util.*;
class RemoveDublicateElement83
{
    public static void main (String args[])
    {
        LinkedHashSet ls=new LinkedHashSet();
        ls.add(10);
        ls.add(10);
        ls.add(30);
        ls.add(30);
        ls.add(20);
        
        TreeSet ts=new TreeSet();
        ts.addAll(ls);
        System.out.println(""+ls);
        System.out.println(""+ts);

    }
}