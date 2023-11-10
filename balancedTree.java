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

class Solution{
  public boolean isBalanced(TreeNode root){
    return checkHeightBalanced(root) != -1;
    }

    private int checkHeightBalanced(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = checkHeightBalanced(node.left);
        if (leftHeight == -1) {
            return -1; 
        }

        int rightHeight = checkHeightBalanced(node.right);
        if (rightHeight == -1) {
            return -1; 
        }
       
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}













