class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        
        return traverse(root.left,root.right);
    }
    public boolean traverse(TreeNode rootLeft, TreeNode rootRight){
        if(rootLeft==null&&rootRight==null)return true;
        if (rootLeft == null || rootRight == null) return false;
        if(rootLeft.val!=rootRight.val) return false;
        return traverse(rootLeft.left,rootRight.right)&&traverse(rootLeft.right,rootRight.left);
    }
}