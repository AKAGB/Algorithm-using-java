public class MinimumMove {
    public static void main(String[] args) {
        MinimumMove obj = new MinimumMove();
        int[] a = new int[] {1, 213123131};
        System.out.println(obj.minMoves(a));
    }

    public int minMoves(int[] nums) {
        if (nums.length == 1) return 0;
        int nMin = nums[0];
        long sum = nums[0];
        boolean flag = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) flag = false;
            nMin = Math.min(nMin, nums[i]);
            sum += nums[i];
        }
        if (flag) return 0;

        int k = 1, n = nums.length;
        while ((sum + (n - 1) * k) % n != 0 || nMin + k < ((sum + (n - 1) * k) / n))
            k++;
        return k;
    }
}
