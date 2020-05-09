package LeetCode.p121买卖股票的最佳时机;

public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        //最大利润
        int maxProfit = 0;
        for (int price:
              prices) {
            //最低价格
            minPrice = Math.min(minPrice,price);

            //最高收益
            maxProfit = Math.max(maxProfit, price-minPrice);
        }

        return maxProfit;
    }
}
