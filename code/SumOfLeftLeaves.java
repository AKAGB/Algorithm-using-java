import java.util.Scanner;

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        SumOfLeftLeaves obj = new SumOfLeftLeaves();
        System.out.println(obj.sumOfLeftLeaves(root));
    }

    public int sumOfLeftLeaves(TreeNode root) {
        // 基础步
        if (root == null) return 0;
        // 递归步
        if (root.left == null) return sumOfLeftLeaves(root.right);
        if (root.left.left == null && root.left.right == null)  // 左叶子
            return root.left.val + sumOfLeftLeaves(root.right);
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public static TreeNode buildTree() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the element: ");
        int v = in.nextInt();
        TreeNode result = new TreeNode(v);
        System.out.print("Node: " + Integer.toString(v) + " Want left? [y/n]: ");
        String ans = in.next();
        result.left =  (ans.equals("y")) ? buildTree() : null;
        System.out.print("Node: " + Integer.toString(v) + " Want Right? [y/n]: ");
        ans = in.next();
        result.right =  (ans.equals("y")) ? buildTree() : null;
        return result;
    }

    public static boolean treefind(TreeNode root, int k) {
        // 查找二叉搜索树中有没有元素k
        // 基础步
        if (root == null) return false;
        if (root.val == k) return true;

        // 递归步
        if (root.val > k) return treefind(root.left, k);
        else return treefind(root.right, k);
    }
 }
