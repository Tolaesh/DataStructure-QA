package Graph.BFS;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelTreeNode {
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

    public List<List<Integer>> levelBFS(TreeNode root){
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> lis = new ArrayList<>();

        que.offer(root);
        if(root == null) return lis;
        while(!que.isEmpty()){
            int n =que.size();
            List<Integer> res = new ArrayList<>();

            for(int i=0; i<n; i++){
                TreeNode node = que.poll();
                res.add(node.val);

                if(node.left != null){
                    que.offer(node.left);
                }
                if(node.right != null){
                    que.offer(node.right);
                }
            }
           lis.add(res);
        }
        return lis;
    }

    }



