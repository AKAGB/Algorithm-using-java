public class FindDiff {
    public static void main(String[] args) {
        FindDiff obj = new FindDiff();
        System.out.println(obj.findTheDifference("a", "aa"));
    }

    public char findTheDifference(String s, String t) {
        int a[] = new int[26];
        for (int i = 0; i < a.length; i++)
            a[i] = 0;

        for (int i = 0; i < t.length(); i++)
            a[t.charAt(i) - 'a']++;

        for (int i = 0; i < s.length(); i++)
            a[s.charAt(i) - 'a']--;

        int i;
        for (i = 0; i < a.length; i++)
            if (a[i] == 1)
                break;
        return (char)(i + 'a');
    }
}
