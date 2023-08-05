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
  public boolean sametree(TreeNode root1,TreeNode root2){
        if (root1 == null && root2 == null) {
            return true; 
        }

        if (root1 == null || root2 == null) {
            return false; 
        }

        if (root1.data != root2.data) {
            return false; 
        }
        return sametree(root1.left, root2.left) && sametree(root1.right,root2.right);
}
}