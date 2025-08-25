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
    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode front = null;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        temp = prev;
        int carry = 0, n = 0;
        while (temp != null) {
            n = (temp.val * 2) / 10;
            temp.val = ((temp.val * 2) % 10) + carry;
            carry = n;
            if (carry != 0 && temp.next == null) {
                ListNode newNode = new ListNode(1);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }


        temp = prev;
        prev = null;
        front = null;
        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}