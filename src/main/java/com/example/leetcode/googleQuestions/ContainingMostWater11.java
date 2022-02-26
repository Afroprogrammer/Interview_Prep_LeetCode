package com.example.leetcode.googleQuestions;

/**
 * use the sliding window method
 * create max_area variable and instantiate it to 0;
 * left_pointer to start at the beginning of the array
 * right pointer at the end of the array
 * while loop where the left pointer is lesser than the right pointer
 * calculate the current area by finding the min value of the left and right pointer value * the difference
 * Math.min(height[left], height[right]) * (right - left);
 * update the max value by finding the max value between the max area and the current area
 * if the left index value is less than the right index value, increment the left index. else decrement the right
 * index;
 * return the max value
 */
public class ContainingMostWater11 {
    public int maxArea(int[] height) {
        int max_area = 0;
        int left_pointer = 0;
        int right_pointer = height.length - 1;

        while (left_pointer < right_pointer) {
            //calculate your current value

            int current_area = Math.min(height[left_pointer], height[right_pointer]) * (right_pointer - left_pointer);
            max_area = Math.max(current_area, max_area);

            if (height[left_pointer] < height[right_pointer]) {
                left_pointer++;
            } else {
                right_pointer--;
            }
        }

        return max_area;
    }
}
