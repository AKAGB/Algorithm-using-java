import java.util.Arrays;

public class ConstructRect {
    public static void main(String[] args) {
        ConstructRect obj = new ConstructRect();
        System.out.println(Arrays.toString(obj.constructRectangle(4)));
    }

    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        int middle = (int)Math.sqrt(area);
        while (middle > 1) {
            if (area % middle == 0) break;
            middle--;
        }
        result[0] = area / middle;
        result[1] = middle;
        return result;
    }
}
