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
    public int countNodes(TreeNode root) {
        int value =0;
        int out = count(root,value);

        return out;
    }
    public int count(TreeNode root,int value){
        
        if(root==null){
            return value;
        }
        else {
            value++;
           int leftC= count(root.left,value);
           int rightC= count(root.right,leftC);
           return rightC;
    }
}
}