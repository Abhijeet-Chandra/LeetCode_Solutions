class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        int counter = 0;
        TreeNode node = root;
        while(!st.isEmpty()||node!=null){
            while(node!=null){
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            counter++;
            if(counter==k)return node.val;
            node = node.right;
        }
        return -1;
    }
}