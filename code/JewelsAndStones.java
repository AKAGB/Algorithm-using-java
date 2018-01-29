import java.util.*;

public class JewelsAndStones {
    public static void main(String[] args) {
        JewelsAndStones obj = new JewelsAndStones();
        Scanner in = new Scanner(System.in);
        System.out.print("Input J: ");
        String J = in.next();
        System.out.print("Input S: ");
        String S = in.next();
        System.out.println(obj.numJewelsInStones(J, S));
        in.close();
    }

    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j))
                    result++;
            }
        }
        return result;
    }
}
