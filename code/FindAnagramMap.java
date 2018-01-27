import java.util.*;

public class FindAnagramMap {
    public static void main(String[] args) {
        FindAnagramMap obj = new FindAnagramMap();
        int[] a = {12, 28, 46, 32, 50};
        int[] b = {50, 12, 32, 46, 28};
        System.out.println(Arrays.toString(obj.anagramMappings(a, b)));
    }

    public int[] anagramMappings(int[] A, int[] B) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (B[j] == A[i]) {
                    result[i] = j;
                }
            }
        }
        return result;
    }
}
