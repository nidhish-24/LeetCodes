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
    public int maxLevelSum(TreeNode root) {
        
        Queue<TreeNode> que= new LinkedList<>();
        int level=0;
        int max=Integer.MIN_VALUE;
        que.add(root);
        int sum1=root.val;
        int l=0;
        while(!que.isEmpty()){
            int size=que.size();
           
            int sum=0;
           for(int i=0;i<size;i++){
             TreeNode n = que.poll();
            sum+=n.val;
            if(n.left!=null){
                que.add(n.left);
            }
            if(n.right!=null){
                que.add(n.right);
            }
           }
            if(sum>max){
                max=sum;
                level=l;
            }
        l++;
        }
        
        return level+1;
    }
}