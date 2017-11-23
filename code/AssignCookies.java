import java.util.*;

public class AssignCookies {
    public static void main(String[] args) {
        AssignCookies obj = new AssignCookies();
        int[] g = new int[] {1,2};
        int[] s = new int[] {1,2,3};
        System.out.println(obj.findContentChildren(g,s));
    }

    public int findContentChildren(int[] g, int[] s) {
        int sum = 0;
        Arrays.sort(s);
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    sum++;
                    s[j] = 0;
                    break;
                }
            }
        }
        return sum;
    }
}
