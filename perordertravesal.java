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
  public List<Integer> preorder(TreeNode root){
    List<Integer> l = new ArrayList<>();
    preorder(root,l);
    return l;
  }
  public void preorder(TreeNode root,List<Integer> l){
      if(root==null){
          return;
      }
      l.add(root.data);
      preorder(root.left,l);
      preorder(root.right,l);
  }
}
