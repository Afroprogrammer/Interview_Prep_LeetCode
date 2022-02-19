package com.example.leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList();   //create and arraylist of strings to store the number--

        for (int i, j = 0; j < nums.length; ++j) {   //create a for loop with i and j where they start at j that checks the bounds of the array
            i = j;  //after every loop equate j to i
            /**create awhile loop where it has an and operator that checks the array bound and check if the
             value of the jth index + 1 index is equal to the value of the next index*/
            while (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
                ++j;  //if true increment j
            }
            if (i == j) {          //create an if statement that compares j to i. if. true add vale of i  to the array
                output.add(nums[i] + ""); //if true add the value at the ith position
            } else {
                output.add(nums[i] + "->" + nums[j]);  //add the value at index i "=>"  + value at index j
            }

        }
        //break out of the loop return the array
        return output;
    }


    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(nums).toString());

/**Input: nums = [0,1,2,4,5,7]
 Output: ["0->2","4->5","7"] **/

//time complexity O(n) because we loop through once
    }
}

