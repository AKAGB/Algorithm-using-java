public class LargestTwice {
    public static void main(String[] args) {
        LargestTwice obj = new LargestTwice();
        int[] nums = {0, 0, 3, 2};
        System.out.println(obj.dominantIndex(nums));
    }

    public int dominantIndex(int[] nums) {
        int maxnum = 0, secondnum = 0, index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxnum) {
                secondnum = maxnum;
                maxnum = nums[i];
                index = i;
            }
            else if (nums[i] > secondnum)
                secondnum = nums[i];
        }
        //System.out.println(maxnum + " " + secondnum);
        return (maxnum >= 2 * secondnum) ? index : -1;
    }
}
