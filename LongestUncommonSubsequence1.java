public class LongestUncommonSubsequence1 {
    public static void main(String[] args) {
        Solution solu = new Solution();
        String a = "aba", b = "cdc";
        System.out.println(solu.findLUSlength(a, b));
    }
}

class Solution {
    public int findLUSlength(String a, String b) {
        return (a.equals(b) ? -1 : Integer.max(a.length(), b.length()));
    }
}
