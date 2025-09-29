class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)return new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            list.add(node.val);
            if(node.left!=null) st.push(node.left);
            if(node.right!=null) st.push(node.right);
        }
        Collections.reverse(list);
        return list;
    }
}