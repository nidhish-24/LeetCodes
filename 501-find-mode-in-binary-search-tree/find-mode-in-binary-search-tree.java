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
    public int[] findMode(TreeNode root) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        traversal(root,map);
        int maxFreq=0;
        for (int val : map.values()) {
            maxFreq = Math.max(maxFreq, val);
        }

                List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                list.add(entry.getKey());
            }
        }

        // Convert list to array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
        
    }
    public void traversal(TreeNode root,HashMap<Integer,Integer> map){
     
     if(root==null){
        return;
     }
     map.put(root.val,map.getOrDefault(root.val,0)+1);
     traversal(root.left,map);
     traversal(root.right,map);
     
    }
}