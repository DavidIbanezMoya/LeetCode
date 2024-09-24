using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.src.TopInterviewQuestions.Easy.Array
{

    /*You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.*/
    class BuyAndSellStock
    {
        public int MaxProfit(int[]prices)
        {
            if (prices.Length == 0)
            {
                return 0;
            }
            int currentProfit = 0;
            int lowestNumber = prices[0];
            int highestNumber = 0;

            //We will iterate over the prices to search for the higher profit
            for (int i = 0; i <= prices.Length-1; i++)
            {
                if (i == prices.Length - 1)
                {
                    return currentProfit;
                }
                if (prices[i] > prices[i+1])
                {
                    highestNumber = prices[i];
                    //We won't do anything as the next one is lower
                }
                else if (prices[i] < prices[i+1] && prices[i] < lowestNumber){
                    //While loop until it finds a minor num?
                    lowestNumber = prices[i];
                }
                else if (prices[i+1] > highestNumber)
                {
                    highestNumber = prices[i+1];
                }


                if (highestNumber != 0 && lowestNumber >= 0)
                {
                    currentProfit += highestNumber - lowestNumber;
                    lowestNumber = prices[i+1];
                    highestNumber = 0;
                }
            }

            return currentProfit;
        }
    }
}
