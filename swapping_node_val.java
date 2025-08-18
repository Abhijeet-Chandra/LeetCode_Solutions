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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ListNode p1 = null;
        ListNode p2 = null;
        while(temp!=null)
        {
            if(p2!=null)
            {
                p2 = p2.next;
            }
            k--;
            if(k==0)
            {
                p1 = temp;
                p2 = head;
            }
            temp = temp.next;
        }
        int box = p1.val;
        p1.val = p2.val;
        p2.val = box;
        return head;
    }
}