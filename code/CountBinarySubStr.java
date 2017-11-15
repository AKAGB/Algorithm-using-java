public class CountBinarySubStr {
    public static void main(String[] args) {
        CountBinarySubStr obj = new CountBinarySubStr();
        System.out.println(obj.countBinarySubstrings("00110011"));
        System.out.println(obj.countBinarySubstrings("10101"));
    }

    public int countBinarySubstrings(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                cnt++;
                int j = i + 1, k = i;
                while (k - 1 >= 0 && j + 1 < s.length()
                    && s.charAt(k) == s.charAt(k-1)
                    && s.charAt(j) == s.charAt(j+1)) {
                    cnt++;
                    k--;
                    j++;
                }
            }
        }
        return cnt;
    }


}
