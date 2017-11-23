public class MaxProfitII {
    public static void main(String[] args) {
        int[] a = new int[] {2,3,4,2,5};
        MaxProfitII obj = new MaxProfitII();
        System.out.println(obj.maxProfit(a));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int sum = 0;
        int[] profits = new int[prices.length];
        for (int i = 1; i < prices.length; i++)
            profits[i] = prices[i] - prices[i - 1];
        for (int i = 1; i < profits.length; i++)
            if (profits[i] > 0)
                sum += profits[i];
        return sum;
    }
}
