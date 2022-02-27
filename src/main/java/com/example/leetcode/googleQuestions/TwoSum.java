package com.example.leetcode.googleQuestions;

import java.util.HashMap;

/**
 * create a hashmap with <Integer, Integer> we would use it to track entries
 * loop through the array finding the complement by subtracting the nums[i] from the target
 * check if the compliment is in the map as a key . If yes return the value of the key which is the index and
 * and the current nums[i];
 * else add the current nums[i], i to the map;
 * return null if nothing is found.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> answer = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(answer.containsKey(complement)){
                return new int[]  {answer.get(complement), nums[i]};
            }
            answer.put(nums[i], i);
        }
        return null;
    }
}