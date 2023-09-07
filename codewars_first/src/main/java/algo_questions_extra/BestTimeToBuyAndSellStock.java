package algo_questions_extra;

public class BestTimeToBuyAndSellStock {


    public static void main(String[] args) {

        int[] prices1 = {7, 3, 5, 3, 6, 4, 8, 9};
        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit2(prices1));
    }


    public static int maxProfit2(int[] prices) {

        int maxProfit = 0;

        for (int i = 0; i < prices.length-1; i++) {

            for (int j = i+1; j < prices.length; j++) {
                if(prices[j]-prices[i] > maxProfit){
                    maxProfit = prices[j]-prices[i] ;
                }
            }
        }

        return maxProfit;
    }
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update the minimum price if a lower price is encountered
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update the maximum profit if a higher profit is obtained
            }
        }

        return maxProfit;
    }

}
/*
Question-1 Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in
the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example 1:
Input: prices = [7,1,5,3,6,4] Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:
Input: prices = [7,6,4,3,1] Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
Constraints:
 1 <= prices.length <= 105
 0 <= prices[i] <= 104
Please, test your solution here: https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 */
