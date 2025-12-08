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
    List<Integer> list = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        
        listadd(root,list);
        Collections.sort(list);
    

       TreeNode newroot = new TreeNode(list.get(0));
       TreeNode curr = newroot;

       for(int i=1;i<list.size();i++){
        curr.right = new TreeNode(list.get(i));
        curr = curr.right;
       }
       return newroot;

    }

    public void listadd(TreeNode root, List<Integer> list){
        if(root==null){
            return ;
        }
        list.add(root.val);
        listadd(root.left,list);
        listadd(root.right,list);
        return ;
    }

}