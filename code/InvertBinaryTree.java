public class InvertBinaryTree {
    public static void main(String[] args) {

    }
}

class Solution {
    public TreeNode invertTree(TreeNode root) {
        /* 定义状态：翻转后的树 = I(T) =
                          root
                          /  \
                        I(L) I(R)
        */
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
