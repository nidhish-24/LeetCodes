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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        if(root==null){

            return list;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        int last=0;
        while(!que.isEmpty()){

            int size=que.size();

            for(int i=0;i<size;i++){
                 TreeNode n=que.poll();
              last=n.val;

              if(n.left!=null){
                que.add(n.left);
              }
              if(n.right!=null){
                que.add(n.right);
              }
            }
            list.add(last);
        }
        return list; 
           
    }
}