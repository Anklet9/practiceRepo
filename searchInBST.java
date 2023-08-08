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
class Solution{
	public TreeNode Search(TreeNode root,int data){
		if (root == null || root.data == data) {
            return root;
        }

        if (data < root.data) {
            return Search(root.left, data);
        } else {
            return Search(root.right, data);
        }
    }

    public void printSubtree(TreeNode node) {
        if (node == null) {
            System.out.println("No Node");
            return;
        }

        if (node.left != null) {
            System.out.println(node.left.data);
        } else {
            System.out.println("No Node");
        }

        System.out.println(node.data);

        if (node.right != null) {
            System.out.println(node.right.data);
        } else {
            System.out.println("No Node");
        }
    }

}

