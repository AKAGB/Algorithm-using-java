public class BitsCharacters {
    public static void main(String[] args) {
        int a1[] = new int[] {1, 0, 0};
        int a2[] = new int[] {1, 1, 1, 0};
        Solution solu = new Solution();
        System.out.println(solu.isOneBitCharacter(a1));
        System.out.println(solu.isOneBitCharacter(a2));
    }
}

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        // 简单的动态规划
        int i = 0;
        while (i < bits.length - 1)
            i = bits[i] == 1 ? i + 2 : i + 1;
        return i == bits.length - 1 ? true : false;
    }
}
