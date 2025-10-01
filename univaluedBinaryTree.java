class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return checkUnival(root,root.val);
    }
    public boolean checkUnival(TreeNode root, int rootval){
        if(root==null)return true;
        if(root.val!=rootval)return false;
        return checkUnival(root.left,rootval)&&checkUnival(root.right,rootval);
    }
}