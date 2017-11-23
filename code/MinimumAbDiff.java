import java.util.*;

public class MinimumAbDiff {
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        MinimumAbDiff obj = new MinimumAbDiff();
        System.out.println(obj.getMinimumDifference(root));
    }

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        int ds_root = getMinOfRoot(root);
        int l = getMinimumDifference(root.left);
        int r = getMinimumDifference(root.right);
        int result = Math.min(ds_root, l);
        result = Math.min(result, r);
        return result;
    }

    public int getMinOfRoot(TreeNode root) {
        TreeNode l = root.left;
        TreeNode r = root.right;
        if (l == null && r == null) return Integer.MAX_VALUE;
        while (l != null && l.right != null) l = l.right;
        while (r != null && r.left != null) r = r.left;

        if (l == null)
            return Math.abs(r.val - root.val);
        else if (r == null)
            return Math.abs(l.val - root.val);
        else
            return Math.min(Math.abs(r.val - root.val), Math.abs(l.val - root.val));
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
