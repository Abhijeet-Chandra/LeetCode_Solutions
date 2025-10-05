class Solution {
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode head = null;
        TreeNode tail = null;
        TreeNode node = root;
        while(!st.isEmpty()||node!=null){
            while(node!=null){
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            TreeNode newNode = new TreeNode(node.val);
            newNode.left = null;
            newNode.right = null;
            if(head==null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.right = newNode;
                tail = newNode;                
            }
            node = node.right;
        }
        return head;
    }
}