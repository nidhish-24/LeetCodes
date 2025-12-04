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
        List<String> list = new ArrayList<>();

         return route(root,"",list);
    }

    public List<String> route(TreeNode root,String path, List<String> list){
       if(root==null){
        return list;
       }
       if(root.left==null && root.right==null){
        path = path+String.valueOf(root.val);
        list.add(path);
       }
       path = path + String.valueOf(root.val)+"->";
       route(root.left,path,list);
       route(root.right,path,list);
       return list;
    }
}