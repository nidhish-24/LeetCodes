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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        st1 = leafst(root1,st1);
        st2 = leafst(root2,st2);
        
        int size1 = st1.size();
        int size2 = st2.size();

        if(size1!=size2){
            return false;
        }
        int flag=1;
        for(int i=0;i<size1;i++){
            if(st1.pop().intValue()!=st2.pop().intValue()){
                flag=0;
                break;
            }
        }
        if(flag==1){
            return true;
        }
         return false;
        
     

    }
    public Stack leafst(TreeNode root , Stack st){
          
          if(root==null){
            return st;
          }
          if(root.left==null && root.right==null){
            st.push(root.val);
          }
          st = leafst(root.left,st);
          st = leafst(root.right,st);

          return st;
    }
}