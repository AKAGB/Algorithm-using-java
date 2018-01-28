public class PrimeNum {
    public static void main(String[] args) {
        PrimeNum obj = new PrimeNum();
        System.out.println(obj.countPrimeSetBits(10, 15));
    }

    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int i = L; i <= R; i++) {
            if (isPrime(Integer.bitCount(i)))
                count++;
        }
        return count;
    }

    public boolean isPrime(int num) {
        if (num == 1) return false;
        if (num == 2) return true;
        int n = (int) Math.sqrt(num);
        for (int i = 2; i <= n; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
