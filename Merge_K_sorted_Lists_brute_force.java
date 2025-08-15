//brute force-1
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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<lists.length; i++)
            {
                ListNode temp = lists[i];
                while(temp!=null)
                {
                    arr.add(temp.val);
                    temp = temp.next;
                }
            }
        ListNode head3 = null;
        ListNode temp = null;
        Collections.sort(arr);
        for(int num: arr)
        {
            ListNode newNode = new ListNode(num,null);
            if(head3==null)
            {
                head3 = newNode;
                temp = newNode;
            }
            else{
                temp.next = newNode;
                temp = newNode;
            }
        }
        return head3;
    }
}
//brute force-2
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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head3 = null;
        ListNode tail = null;
        for(int i=0; i<lists.length; i++)
        {
            ListNode temp = lists[i];
            while(temp!=null)
            {
                ListNode newNode = new ListNode(temp.val,null);
                if(head3==null)
                {
                    head3 = newNode;
                    tail = newNode;
                }
                else{
                    tail.next = newNode;
                    tail = newNode;
                }
                temp = temp.next;
            }
        }
        int store;
        for(ListNode i = head3; i!=null; i=i.next)
        {
            for(ListNode j = i.next; j!=null; j = j.next)
            {
                if (i.val>j.val) {
                    store = i.val;
                    i.val = j.val;
                    j.val = store;
                }
            }
        }
        return head3;
    }
}
//brute force-3
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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2){
        if(head1==null)return head2;
        if(head2==null)return head1;
         if (head2.val < head1.val) {
        ListNode temp = head2;
        head2 = head2.next;
        temp.next = head1;
        head1 = temp;
    }
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        
        while(temp1!=null&&temp1.next!=null&&temp2!=null)
        {
            if(temp1.next.val>temp2.val)
            {
                ListNode newNode = new ListNode(temp2.val, null);
                newNode.next = temp1.next;
                temp1.next = newNode;
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        while(temp2!=null)
        {
            ListNode newNode = new ListNode(temp2.val, null);
            temp1.next = newNode;
            temp1 = newNode;
            temp2 = temp2.next;
        }
        return head1;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        for(int i=1; i<lists.length; i++)
        {
            lists[0] = mergeTwoLists(lists[0],lists[i]);
        }
        return lists[0];
    }
}