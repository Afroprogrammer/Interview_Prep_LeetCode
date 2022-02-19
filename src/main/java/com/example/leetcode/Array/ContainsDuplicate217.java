package com.example.leetcode.Array;

import java.util.HashSet;
import java.util.Set;

/**
 * create a new data structure called the hashset
 * iterate through the given array and check if the given hashset already contains the object
 * if it contains return true it contains duplicate
 * add to the set. if not then it does not contain duplicate return false
 *
 * Time complexity 0(n)
 */
public class ContainsDuplicate217 {
    public static boolean containsDuplicate(int[] nums) {
        Set resultsSet = new HashSet();
          for (int num : nums)
          {
              if(resultsSet.contains(num)){
                  return true;
              }
              resultsSet.add(num);
          }
        return false;
    }

    public static void main(String[] args) {
       int [] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));

        /**
         * Input: nums = [1,2,3,1]
         * Output: true
         */
    }

}
