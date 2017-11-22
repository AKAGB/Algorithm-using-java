public class ConvertBST {
    int sum = 0;

    public static void main(String[] args) {

    }

    public TreeNode convertBST(TreeNode root) {
        // 思路很简单，反向中序遍历树按照降序方式遍历所有树，设置一个sum
        sum = 0;
        res_inorder(root);
        return root;
    }

    public void res_inorder(TreeNode root) {
        if (root == null) return;
        res_inorder(root.right);
        root.val += sum;
        sum = root.val;
        res_inorder(root.left);
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
