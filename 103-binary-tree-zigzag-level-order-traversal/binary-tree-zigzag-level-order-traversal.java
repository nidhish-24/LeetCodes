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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>(); 
        if(root==null){
            return res;
        }
     
      Queue<TreeNode> que = new LinkedList<>();
       que.add(root);
       
      
       int flag=0;

       
       while(!que.isEmpty()){
       
        int size=que.size();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            
            TreeNode n = que.poll();
            list.add(n.val);

            if(n.left!=null){
                que.add(n.left);
            }
            if(n.right!=null){
                que.add(n.right);
            }
        }
        if(flag==1){
            Collections.reverse(list);
            res.add(list);
            flag=0;
            continue;
        }
        if(flag==0){
            res.add(list);
            flag=1;
        }
       }
       return res;

    }
}