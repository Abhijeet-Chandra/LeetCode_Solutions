class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int sum = 0;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            sum = 0;
            for(int i=0; i<size; i++){
                TreeNode node = q.remove();
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
                sum+=node.val;
            }
        }
        return sum;
    }
}