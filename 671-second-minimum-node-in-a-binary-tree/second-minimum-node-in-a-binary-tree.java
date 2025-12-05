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
    TreeSet<Integer> set = new TreeSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        secondLargest(root,set);
   
        int count = set.size(); 
        if(count<=1){
            return -1;
        }
        int min = set.first();     
         System.out.println(set);        
        Integer second = set.higher(min);  
       
        return (second == null) ? -1 : second;
  

    }
    public void secondLargest(TreeNode root,TreeSet<Integer> set){
        if(root==null){
            return ;
        }
        else{
            set.add(root.val);
        }
        secondLargest(root.left,set);
        secondLargest(root.right,set);

    }
}