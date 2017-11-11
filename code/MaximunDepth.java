public class MaximunDepth {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        // 对maxDepth定义：max(D(L) + D(R))+1
        return (root == null) ? 0 : Integer.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
