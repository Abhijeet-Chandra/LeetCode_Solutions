class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root,false);
    }
    public int helper(TreeNode root, boolean isLeftChild){
        if(root==null)return 0;
        if(root.left==null&&root.right==null&&isLeftChild) return root.val;
        return helper(root.right,false)+helper(root.left, true);
    }
}