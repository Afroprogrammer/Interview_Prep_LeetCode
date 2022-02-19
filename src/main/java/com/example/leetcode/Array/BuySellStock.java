package com.example.leetcode.Array;

/**
 * this is the brute force approach
 */
public class BuySellStock {

    public static int maxProfit(int prices[]) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit){
                    maxprofit = profit;
                }

            }
        }
        return maxprofit;
    }

    public static void printArray(int [] arr){
        for (int i : arr)
        {
            System.out.print(i + "");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int [] example = {7,1,5,3,6,4};
        System.out.println( maxProfit(example) );

        /**
         * Input: nums = [1,3,2,1]
         * Output: [1,3,2,1,1,3,2,1]
         */
    }
}
