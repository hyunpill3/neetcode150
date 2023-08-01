package slidingwindow;

// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int res = 0;
        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                res = Math.max(profit, res);
                r++;
            } else {
                l = r;
                r++;
            }
        }
        return res;
    }
}
