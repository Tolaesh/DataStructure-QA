package Graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class avgOfLevelOfTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Double> avgofBFS(TreeNode root){
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);

        if(root == null) return res;
        while(!que.isEmpty()){
            int n = que.size();
            double sum =0;
            for(int i=0; i<n; i++){
                TreeNode node = que.poll();
                if(node.right != null){
                    que.add(node.right);
                }
                if(node.left != null){
                    que.add(node.left);
                }
                sum +=node.val;
            }
         res.add(sum/n);
        }
        return res;
    }


}
