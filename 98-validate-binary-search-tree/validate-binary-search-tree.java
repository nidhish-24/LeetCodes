class Solution {
    public boolean isValidBST(TreeNode root) {
        return validTree(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean validTree(TreeNode root, long min, long max){
        if(root == null) return true;

        if(root.val <= min || root.val >= max) return false;

        return validTree(root.left, min, root.val) &&
               validTree(root.right, root.val, max);
    }
}