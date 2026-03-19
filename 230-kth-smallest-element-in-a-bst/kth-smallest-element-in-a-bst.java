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
    public int kthSmallest(TreeNode root, int k) {
        
        HashSet<Integer> set = new HashSet<>();
        treeTravesal(root,set);
        
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.get(k-1);


    }

    public void treeTravesal(TreeNode root,HashSet<Integer> set){
        
        if(root==null){
            return;
        }
        set.add(root.val);
        treeTravesal(root.left,set);
        treeTravesal(root.right,set);
    } 
}