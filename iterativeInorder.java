class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)return new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode node = root;
        while(!st.isEmpty()||node!=null){
            while(node!=null){
                st.push(node);
                node = node.left;
            }
            node = st.pop();
            list.add(node.val);
            node = node.right;
        }
        return list;
    }
}