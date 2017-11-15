public class SumOfIntegers {
    public static void main(String[] args) {
        SumOfIntegers obj = new SumOfIntegers();
        System.out.print(obj.getSum(3,2));
    }

    public int getSum(int a, int b) {
        int cn = a & b;
        int result = a ^ b;
        while (cn != 0) {
            cn <<= 1;
            int tmp = result;
            result ^= cn;
            cn &= tmp;
        }
        return result;
    }
}
