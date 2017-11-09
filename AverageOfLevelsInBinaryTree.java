import java.util.*;

/*
Input:
    3
   / \
  9  20
    /  \
   15   7
Output:
[3, 14.5, 11]
*/
public class AverageOfLevelsInBinaryTree {
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        Solution solu = new Solution();
        List<Double> result = solu.averageOfLevels(root);
        System.out.println("Result:");
        for (Double each : result) {
            System.out.println(each);
        }
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
}

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> que1 = new LinkedList<TreeNode>(),
         que2 = new LinkedList<TreeNode>();
        que1.offer(root);
        List<Double> result = new ArrayList<Double>();

        while (que1.peek() != null) {       // 外层循环遍历树的每一层
            double sum = 0;                 // 计算这一层节点的和
            int cnt = 0;                    // 计算这一层节点数
            while (que1.peek() != null) {   // 内层循环遍历这一层节点，将子节点压入que2
                TreeNode node = que1.poll();
                sum += node.val;
                cnt++;
                if (node.left != null) que2.offer(node.left);
                if (node.right != null) que2.offer(node.right);
            }
            result.add(sum / cnt);
            que1 = que2;
            que2 = new LinkedList<TreeNode>();
        }
        return result;
    }
}
