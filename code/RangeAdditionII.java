public class RangeAdditionII {
    public static void main(String[] args) {
        RangeAdditionII obj = new RangeAdditionII();
        int[][] a = new int[][] {{2, 2}, {3, 3}};
        System.out.println(obj.maxCount(3, 3, a));
    }

    public int maxCount(int m, int n, int[][] ops) {
        int i_min = m, j_min = n;
        for (int i = 0; i < ops.length; i++) {
            i_min = Math.min(i_min, ops[i][0]);
            j_min = Math.min(j_min, ops[i][1]);
        }
        return i_min*j_min;
    }
}
