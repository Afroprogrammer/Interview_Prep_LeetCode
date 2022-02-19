package com.example.leetcode.Array;

/**
 * create a new array of size the length of the given array * 2 to store the answer
  create a for loop to loop in the array
 populate the first half of your given array and
 populate the second half of your given array with index of i + the array length

 **Time complexity would be 0(n)
 **/
public class ConcatenationArray1929 {
    public static int[] getConcatenation(int[] nums) {
         int [] res = new int[nums.length * 2];
         for (int i = 0; i < nums.length; i++){
             res[i] = nums[i];
             res[i + nums.length] = nums[i];
         }
        return res;
    }
    public static void printArray(int [] arr){
        for (int i : arr)
        {
            System.out.print(i + "");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int [] example = {1,3,2,1};
       printArray (getConcatenation(example)) ;

        /**
         * Input: nums = [1,3,2,1]
         * Output: [1,3,2,1,1,3,2,1]
         */
    }
}
