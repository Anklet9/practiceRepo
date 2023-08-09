/*
class TreeNode{
  int data;
  TreeNode left;
  TreeNode right;
  
  TreeNode(int data){
    this.data = data;
    this.left = this.right = null;
  }
}
*/
class Solution{
  TreeNode prev;
  public boolean isValidBST(TreeNode root){
        prev = null;
        return inorderTraversal(root);
    }

    private boolean inorderTraversal(TreeNode node) {
        if (node == null) {
            return true;
        }

        if (!inorderTraversal(node.left)) {
            return false;
        }

        if (prev != null && prev.data >= node.data) {
            return false;
        }
        prev = node;

        return inorderTraversal(node.right);
    }
}
