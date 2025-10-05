class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        while(!st.isEmpty()||node!=null){
            while(node!=null){
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            if(node.val>=low&&node.val<=high){
                sum+=node.val;
            }
            node = node.right;
        }
        return sum;
    }
}