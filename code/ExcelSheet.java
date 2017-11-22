import java.util.*;

public class ExcelSheet {
    public static void main(String[] args) {
        ExcelSheet obj = new ExcelSheet();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Please Input the string: (q to quit)");
            String s = in.next();
            if (s.equals("q")) break;
            System.out.println(obj.titleToNumber(s));
        }
        in.close();
    }

    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (int)((s.charAt(s.length() - i - 1) - 'A' + 1) * Math.pow(26, i));
        }
        return sum;
    }
}
