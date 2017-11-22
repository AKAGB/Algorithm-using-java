import java.util.*;

public class TwoSumIV {
    public static void main(String[] args) {
        TwoSumIV obj = new TwoSumIV();
        TreeNode root = TreeNode.buildTree();
        Scanner in = new Scanner(System.in);

        System.out.print("Please Input the target: ");
        int target = in.nextInt();
        boolean result = obj.findTarget(root, target);
        System.out.println("Result: " + result);

        in.close();
    }

    public boolean findTarget(TreeNode root, int k) {
        // 思路(暴力)：遍历树把元素放到数组里，然后遍历数组，复杂度是O(n^2)
        if (root == null) return false;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);

        // 层序遍历
        while (q.peek() != null) {
            TreeNode node = q.poll();
            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);

            if (node.val * 2 != k && TreeNode.treefind(root, k - root.val)) return true;
        }
        return false;
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
