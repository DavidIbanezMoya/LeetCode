package Top100.Greedy;

/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BestBuyAndSellStock {
    public int maxProfit(int[] prices) {

        int minPrize = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrize) {
                minPrize = prices[i];
            }
            else {
                //Get the maxProfit
                    if (prices[i] - minPrize > maxProfit) {
                        maxProfit = prices[i] - minPrize;
                    }
                }

        }
        System.out.println(minPrize);
        System.out.println(maxProfit);
        return maxProfit;
    }
}
