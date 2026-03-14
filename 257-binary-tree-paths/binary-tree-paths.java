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
    public List<String> binaryTreePaths(TreeNode root) {
        String out="";
        List<String> list = new ArrayList<>();
        return tree(root,out,list);
    }
    public List<String> tree(TreeNode root,String out,List<String> list){

      if(root==null){
        return list;
      }
      if(root.left==null && root.right==null){
          out+=String.valueOf(root.val);
         list.add(out);
         return list;
      }
      out+=String.valueOf(root.val)+"->";
      tree(root.left,out,list);
      tree(root.right,out,list);   
      
      return list;
    }   
}