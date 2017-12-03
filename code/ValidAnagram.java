import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram obj = new ValidAnagram();
        String t = new String("anagram"), s = new String("nagaram");
        System.out.println(obj.isAnagram(t, s));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] alphas = new int[26];
        Arrays.fill(alphas, 0);
        for (int i = 0; i < s.length(); i++) {
            alphas[s.charAt(i)-'a']++;
            alphas[t.charAt(i)-'a']--;
        }
        for (int each : alphas)
            if (each != 0)
                return false;
        return true;
    }
}
