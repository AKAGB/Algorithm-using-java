import java.util.*;

public class MaxAreaOfIsland {
    public static void main(String[] args) {
        int a1[][] = new int[][] {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                                 {0,0,0,0,0,0,0,1,1,1,0,0,0},
                                 {0,1,1,0,1,0,0,0,0,0,0,0,0},
                                 {0,1,0,0,1,1,0,0,1,0,1,0,0},
                                 {0,1,0,0,1,1,0,0,1,1,1,0,0},
                                 {0,0,0,0,0,0,0,0,0,0,1,0,0},
                                 {0,0,0,0,0,0,0,1,1,1,0,0,0},
                                 {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int a2[][] = new int[][] {{0,0,0,0,0,0,0,0}};
        Solution solu = new Solution();
        System.out.println(solu.maxAreaOfIsland(a1));
        System.out.println(solu.maxAreaOfIsland(a2));
    }
}

class Node {
    int i;
    int j;

    public Node(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] pos = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                pos[i][j] = false;

        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !pos[i][j]) {
                    max = Math.max(max, traveral(grid, pos, i, j));
                }
            }
        }
        return max;
    }

    public static int traveral(int[][] grid, boolean[][] pos, int i, int j) {
        Stack<Node> stack = new Stack<Node>();
        pos[i][j] = true;
        stack.push(new Node(i, j));
        int result = 0;
        while (!stack.empty()) {
            result++;
            Node n = stack.pop();
            if (n.i + 1 < grid.length && grid[n.i + 1][n.j] == 1 && !pos[n.i + 1][n.j]) {
                stack.push(new Node(n.i + 1, n.j));
                pos[n.i + 1][n.j] = true;
            }
            if (n.i - 1 >= 0 && grid[n.i - 1][n.j] == 1 && !pos[n.i - 1][n.j]) {
                stack.push(new Node(n.i - 1, n.j));
                pos[n.i - 1][n.j] = true;
            }
            if (n.j + 1 < grid[0].length && grid[n.i][n.j + 1] == 1 && !pos[n.i][n.j + 1]) {
                stack.push(new Node(n.i, n.j + 1));
                pos[n.i][n.j + 1] = true;
            }
            if (n.j - 1 >= 0 && grid[n.i][n.j - 1] == 1 && !pos[n.i][n.j - 1]) {
                stack.push(new Node(n.i, n.j - 1));
                pos[n.i][n.j - 1] = true;
            }
        }
        return result;
    }
}
