
import java.util.ArrayList;
import java.util.List;

class Solution{
 public List<Integer> kdistance(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        findNodesAtDistanceK(root, target, k, result);
        return result;
    }

    private int findNodesAtDistanceK(TreeNode node, TreeNode target, int k, List<Integer> result) {
        if (node == null) {
            return -1;
        }
        
        if (node == target) {
            
            collectNodesAtDistanceK(node, k, result);
            return 0; 
        }

        
        int leftDistance = findNodesAtDistanceK(node.left, target, k, result);
        int rightDistance = findNodesAtDistanceK(node.right, target, k, result);

        if (leftDistance != -1) {
            
            if (leftDistance + 1 == k) {
                result.add(node.data); 
            } else {
                
                collectNodesAtDistanceK(node.right, k - leftDistance - 2, result);
            }
            return leftDistance + 1; 
        }

        if (rightDistance != -1) {
            
            if (rightDistance + 1 == k) {
                result.add(node.data); 
            } else {
    
                collectNodesAtDistanceK(node.left, k - rightDistance - 2, result);
            }
            return rightDistance + 1; 
        }

        return -1; 
    }

    private void collectNodesAtDistanceK(TreeNode node, int k, List<Integer> result) {
        if (node == null || k < 0) {
            return;
        }
        if (k == 0) {
            result.add(node.data); 
            return;
        }
        collectNodesAtDistanceK(node.left, k - 1, result);
        collectNodesAtDistanceK(node.right, k - 1, result);
    }

}


