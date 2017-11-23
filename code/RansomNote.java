public class RansomNote {
    public static void main(String[] args) {
        RansomNote obj = new RansomNote();
        String[] test1 = new String[] {"a", "aa", "aa"};
        String[] test2 = new String[] {"b", "ab", "aab"};

        for (int i = 0; i < test1.length; i++) {
            System.out.println(obj.canConstruct(test1[i], test2[i]));
        }
     }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphas = new int[26];
        for (int i = 0; i < alphas.length; i++)
            alphas[i] = 0;
        for (int i = 0; i < ransomNote.length(); i++)
            alphas[ransomNote.charAt(i) - 'a']--;
        for (int i = 0; i < magazine.length(); i++)
            alphas[magazine.charAt(i) - 'a']++;
        for (int i = 0; i < alphas.length; i++)
            if (alphas[i] < 0) return false;
        return true;
    }
}
