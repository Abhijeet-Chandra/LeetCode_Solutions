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
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null)
        {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        temp = prev;

        Stack<Integer> st = new Stack<>();
        ListNode headnew = null;
        while(temp!=null)
        {
            int curr = temp.val;
            while(!st.isEmpty()&&temp.val>=st.peek())
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                temp.val = -1;
                ListNode newNode = new ListNode(curr);
                if(headnew==null)
                {
                    headnew = newNode;
                }
                else{
                    newNode.next = headnew;
                    headnew = newNode;
                }
            }
            else if(temp.val<st.peek())
            {
                temp.val = st.peek();
            }
            st.push(curr);
            temp = temp.next;
        }
        return headnew;
    }
}