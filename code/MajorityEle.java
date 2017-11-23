import java.util.Arrays;

public class MajorityEle {
    public static void main(String[] args) {
        MajorityEle obj = new MajorityEle();
        int[] a = new int[] {1,2,2,2,3,4,1,2,4,5,5,4,4,3,3,3,3};
        System.out.println(obj.majorityElement(a));
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
        /*下面是一个O(n)复杂度的算法，比较精妙，前提是众数个数大于n/2
        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
        */
    }
}
