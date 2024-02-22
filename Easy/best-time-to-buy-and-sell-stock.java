/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;
        for (int price : prices) {
            minValue = Math.min(minValue, price);
            maxProfit = Math.max(maxProfit, price - minValue);
        }
        return maxProfit;
    }
}