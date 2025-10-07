class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        long secondSmallest = Long.MAX_VALUE;
        while(!q.isEmpty()){
            TreeNode node = q.remove();
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
            if(node.val>root.val&&node.val<secondSmallest){
                secondSmallest = node.val;
            }
        }
        return secondSmallest==Long.MAX_VALUE?-1:(int)secondSmallest;
    }
}