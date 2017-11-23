import java.util.*;

public class BnryTreeTilt {
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        BnryTreeTilt obj = new BnryTreeTilt();
        System.out.println(obj.findTilt(root));
    }

    public int findTilt(TreeNode root) {
        if (root == null) return 0;
        int result = Math.abs(sumOfNodes(root.left) - sumOfNodes(root.right));
        return result + findTilt(root.left) + findTilt(root.right);
    }

    public int sumOfNodes(TreeNode root) {
        if (root == null) return 0;
        return root.val + sumOfNodes(root.left) + sumOfNodes(root.right);
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
