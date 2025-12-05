/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Stack<TreeNode> st1 = new Stack<>();
      Stack<TreeNode> st2 = new Stack<>();
    public TreeNode invertTree(TreeNode root) {
        

         return invert(root);
    }
    public TreeNode invert(TreeNode root){
      if(root==null){
        return root;
      }
      st1.add(root.left);
      
      st1.add(root.right);
    

   TreeNode left =  invert(root.left);
   TreeNode right = invert(root.right);

   root.left = right;
   root.right = left;


      return root;
    }
}