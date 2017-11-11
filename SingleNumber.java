public class SingleNumber {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 3, 2, 5, 5, 6, 1};
        Solution solu = new Solution();

        int result = solu.singleNumber(a);
        System.out.println(result);
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int each : nums)
            result ^= each;
        return result;
    }
}
