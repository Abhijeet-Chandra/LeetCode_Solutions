class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Double> list = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double avg = 0;
            for(int i=0; i<size; i++){
                TreeNode node = queue.remove();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
                avg +=node.val;
            }
            avg = avg/size;
            list.add(avg);
        }
        return list;
    }
}