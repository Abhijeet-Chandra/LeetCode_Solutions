class Solution {
    public int minDiffInBST(TreeNode root) {
        if(root==null)return 0;
        Stack<TreeNode> st = new Stack<>();
        int mindiff = Integer.MAX_VALUE;
        int prev = -1;
        TreeNode node = root;
        while(!st.isEmpty()||node!=null){
            while(node!=null){
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            if(prev!=-1){
                mindiff = Math.min(mindiff, node.val-prev);
            }
            prev = node.val;
            node = node.right;
        }
        
        return mindiff;
    }
}