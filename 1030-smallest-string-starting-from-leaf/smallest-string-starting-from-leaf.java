class Solution {
    public String smallestFromLeaf(TreeNode root) {
        if (root == null) return "";
        
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<String> pathStack = new Stack<>();
        
        nodeStack.push(root);
        pathStack.push(String.valueOf((char)('a' + root.val)));
        
        String smallest = null;
        
        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            String path = pathStack.pop();
            
            // If leaf node, compare and store smallest
            if (node.left == null && node.right == null) {
                if (smallest == null || path.compareTo(smallest) < 0) {
                    smallest = path;
                }
            }
            
            // Push right then left (so left is processed first)
            if (node.right != null) {
                nodeStack.push(node.right);
                pathStack.push((char)('a' + node.right.val) + path); // prepend
            }
            if (node.left != null) {
                nodeStack.push(node.left);
                pathStack.push((char)('a' + node.left.val) + path); // prepend
            }
        }
        return smallest;
    }
}