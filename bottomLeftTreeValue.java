class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int ans = -1;
        q.add(root);
        while(!q.isEmpty()){
           int size = q.size();
           for(int i=0; i<size; i++){
                TreeNode node = q.remove();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                if(i==0) ans = node.val;
           }
        }
        return ans;
    }
}