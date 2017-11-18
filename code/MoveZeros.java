import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = new int[] {0, 1, 0, 3, 12};
        MoveZeros obj = new MoveZeros();
        obj.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int j = i + 1;
                while (j < nums.length && nums[j] == 0) j++;
                if (j < nums.length && nums[j] != 0) {
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
                else break;
            }
        }

        /* 参照 Discuss 的一个O(n)算法
        if (nums == null || nums.length == 0) return;

        int insert_pos = 0;
        for (int num : nums)
            if (num != 0) nums[insert_pos++] = num;

        while (insert_pos < nums.length)
            nums[insert_pos++] = 0;
        */
    }
}
