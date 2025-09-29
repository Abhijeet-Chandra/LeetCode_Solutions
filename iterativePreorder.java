class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)return new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        ArrayList<Integer> list = new ArrayList<>();
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            list.add(node.val);
            if(node.right!=null) st.push(node.right);
            if(node.left!=null) st.push(node.left);
        }
        return list;
    }
}