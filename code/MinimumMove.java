public class MinimumMove {
    public static void main(String[] args) {
        MinimumMove obj = new MinimumMove();
        int[] a = new int[] {32,60,76,68,39,12,26,86,94,39};
        System.out.println(obj.minMoves(a));
    }

    public int minMoves(int[] nums) {
        // 自己的做法，推导了很多公式..
        // 其实看了讨论才发现自己很蠢的把本来能直接写等号的式子写了不等式
        // 才有了下面这么多冗余代码
        // 其实就只有一个公式 result = sum - n * mMin
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

        long n = nums.length;
        sum += 2147483648L * n;
        nMin += 2147483648L;
        long b = n - (sum % n);
        long c = (n-1)*(sum - n*nMin) / b;
        int result = (int)(c * b / (n - 1));
        result = (c * b % (n - 1) == 0) ? result : result+1;
        return result;
    }
}
