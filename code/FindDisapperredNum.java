import java.util.*;

public class FindDisapperredNum {
    public static void main(String[] args) {
        FindDisapperredNum obj = new FindDisapperredNum();
        int a[] = new int[] {4,3,2,7,8,2,3,1};
        List<Integer> l = obj.findDisappearedNumbers(a);
        for (int each : l) {
            System.out.print(each + " ");
        }
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new LinkedList<Integer>();
        int a[] = new int[nums.length];
        for (int i = 0; i < a.length; i++)
            a[i] = 0;
        for (int i = 0; i < nums.length; i++) {
        //    System.out.print(nums[i] + " ");
            a[nums[i] - 1] = 1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) result.add(i+1);
        }
        return result;

    }
}
