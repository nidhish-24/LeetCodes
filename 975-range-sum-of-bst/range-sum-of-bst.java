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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = low+high;
        return rangesum(root,low,high,sum);
    }
    public int rangesum(TreeNode root, int low, int high , int sum){
      
      if(root==null){
        return sum;
      }
      else if(root.val>low&&root.val<high){
        sum+=root.val;
      }
      sum = rangesum(root.left,low,high,sum);
      sum = rangesum(root.right,low,high,sum);
      return sum;
    }
}