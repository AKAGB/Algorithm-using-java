import java.util.*;

public class FirstUniqueCh {
    public static void main(String[] args) {
        FirstUniqueCh obj = new FirstUniqueCh();
        String s = "loveleetcode";
        System.out.println(obj.firstUniqChar(s));
    }

    public int firstUniqChar(String s) {
        int[] alphas = new int[26];
        Arrays.fill(alphas, 0);
        for (int i = 0; i < s.length(); i++)
            alphas[s.charAt(i) - 'a']++;
        for (int i = 0; i < s.length(); i++)
            if (alphas[s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
