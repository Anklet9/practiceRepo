/*
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;


    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution{
    public int width(TreeNode root){
         int width = 0;
        List<List<Integer>> levelList = levelorderTraversal(root);
        for(List<Integer> level: levelList){
            Integer levelWidth = level.size();
            width = Math.max(width, levelWidth);
        }
        return width;
        
	}
	public List<List<Integer>> levelorderTraversal(TreeNode root){
		List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> levelNodes = new ArrayList<>();

            for (int i=0; i<n; i++) {
                TreeNode node = queue.poll();
                levelNodes.add(node.data);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(levelNodes);
        }

        return result;
	}
	
}
