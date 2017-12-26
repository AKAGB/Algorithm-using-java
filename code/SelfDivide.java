import java.util.*;

public class SelfDivide {
    public static void main(String[] args) {
        SelfDivide obj = new SelfDivide();
        List<Integer> l = obj.selfDividingNumbers(1, 22);
        for (int i = 0; i < l.size(); i++)
            System.out.print(l.get(i) + " ");
        System.out.println();
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            int tmp = i;
            while (tmp != 0) {
                if (tmp % 10 == 0 || i % (tmp % 10) != 0)
                    break;
                tmp /= 10;
            }
            if (tmp == 0)
                result.add(i);
        }
        return result;
    }
}
