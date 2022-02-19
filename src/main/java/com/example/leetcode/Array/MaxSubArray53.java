package com.example.leetcode.Array;


/**
 * Sliding window approach
 * create int variable that points to the first value of the  first index of the array (maxSub)
 * create an int value (current sum) that accumulate the sum of the elements in the array
 * loop through  the given array of nums
 * if the currentSum is lesser than zero; change the current sum to zero
 * else add the current number to the current value variable
 * find the maximum value of the by comparing the maxSub with the current sum
 */
public class MaxSubArray53 {
    public static int maxSubArray(int[] nums) {
       int maxSub = nums[0]; //value pointing to the first index of the array
        int currentSum = 0;

        for (int num  :  nums){
            if (currentSum < 0){
                currentSum = 0;
            }
            currentSum = currentSum + num;
//            maxSub = Math.max(maxSub, currentSum);
        }
        maxSub = Math.max(maxSub, currentSum);
        return maxSub;
    }

    public static void main(String[] args) {

        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

        /**
         * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
         * Output: 6
         */
    }
}
