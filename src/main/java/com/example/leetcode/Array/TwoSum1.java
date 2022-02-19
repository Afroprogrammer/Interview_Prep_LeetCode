package com.example.leetcode.Array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * create a hashmap to store the values of the value of the elements in the array as a key
 * and the index as the value
 * create a loop that goes through the arrray
 * create a variable that is the difference  between the target and the current value
 * check if the difference already exists in the hashmap
 * if it exists then return its index  which is the value
 * and return the index of the current value its pointing to
 */
public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        //create a hashmap to store indices
        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();  //creating the hashmap

        //create a for loop through the array of nums
        for(int i = 0; i < nums.length; i++){  //looping through the array
            int diff = target - nums[i];  //checking the difference between the target and the current value
            if(values.containsKey(diff)){        //if the hashmap has the key
                return new int[]{ values.get(diff) , i};   //return the value
            }
            values.put(nums[i], i);   //put it into the hashmap if it does not exist
        }
        return null;

    }

    public static void printArray(int [] arr){
        for (int i : arr)
        {
            System.out.print(i + "");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        int [] nums = {2,7,11,15};
        int target = 9;
       printArray( twoSum(nums,target));



       /**
         *  Input: nums = [2,7,11,15], target = 9
         *  Output: [0,1]
         */


    }
}


