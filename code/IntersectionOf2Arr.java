import java.util.Arrays;

public class IntersectionOf2Arr {
    public static void main(String[] args) {
        IntersectionOf2Arr obj = new IntersectionOf2Arr();
        int[] a1 = new int[] {1,3,6,2,2,1};
        int[] a2 = new int[] {2,2,3,3,5};
        System.out.println(Arrays.toString(obj.intersection(a1,a2)));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        // 暴力解法，其实可以用set存储
        int maxLth = (nums1.length > nums2.length) ? nums1.length : nums2.length;
        int[] result = new int[maxLth];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            while (i < nums1.length-1 && nums1[i+1] == nums1[i]) i++;
            for (int j = 0; j < nums2.length; j++) {
                while (j < nums2.length-1 && nums2[j+1] == nums2[j]) j++;
                if (nums2[j] == nums1[i]) {
                    result[k++] = nums1[i];
                    break;
                }
            }
        }
        result = Arrays.copyOf(result, k);
        return result;
    }
}
