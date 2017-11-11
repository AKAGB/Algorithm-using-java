public class AlternativeBit {
    public static void main(String[] args) {
        Solution solu = new Solution();
        int test[] = new int[] {5, 7, 11, 10, 4};
        for (int each : test)
            System.out.println(solu.hasAlternatingBits(each));
    }
}

class Solution {
    public boolean hasAlternatingBits(int n) {
        return "1010101010101010101010101010101010101010101010101010101010101010".indexOf(Integer.toBinaryString(n)) != -1;
    }
}
