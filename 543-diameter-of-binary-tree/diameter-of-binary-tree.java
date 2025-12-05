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
    int max_dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        length(root);
        return max_dia;
    }
    public int length(TreeNode root){
           
      if(root==null){
        return 0;
      }
     
      int ld = length(root.left);
      int rd =length(root.right);
      int max = ld+rd;
      max_dia = Math.max(max,max_dia);
      return 1+Math.max(ld,rd); 

    
    }
}