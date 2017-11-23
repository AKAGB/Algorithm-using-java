import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        TwoSumII obj = new TwoSumII();
        int[] a = new int[] {-1,0};
        System.out.println(Arrays.toString(obj.twoSum(a, -1)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int i, j;
        int[] result = new int[2];
        for (i = 0; i < numbers.length; i++) {
            j = Arrays.binarySearch(numbers, i+1, numbers.length, target - numbers[i]);
            if (j >= 0) {
                result[0] = i+1;
                result[1] = j+1;
                return result;
            }
        }
        return null;
    }
}
