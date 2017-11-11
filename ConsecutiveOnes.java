public class ConsecutiveOnes {
    public static void main(String[] args) {
        int a[] = new int[] {1, 1, 0, 1, 1, 1};
        Solution solu = new Solution();

        System.out.println(solu.findMaxConsecutiveOnes(a));
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l_max = 0, sum = 0;
        for (int each : nums) {
            if (each == 0 && sum > l_max) l_max = sum;
            sum += each;
            sum *= each;
        }
        l_max = Integer.max(sum, l_max);
        return l_max;
    }
}
