import java.util.*;

public class ConstructStr{
    public static void main(String[] args) {
        ConstructStr obj = new ConstructStr();
        TreeNode root = TreeNode.buildTree();
        Scanner in = new Scanner(System.in);

        System.out.println(obj.tree2str(root));

        in.close();
    }

    public String tree2str(TreeNode t) {
        // 基础步
        if (t == null) return "";
        if (t.left == null && t.right == null) return Integer.toString(t.val);
        // 递归步
        if (t.right == null) return Integer.toString(t.val) + "(" + tree2str(t.left) + ")";
        if (t.left == null) return Integer.toString(t.val) + "()(" + tree2str(t.right) + ")";
        return Integer.toString(t.val) + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
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
