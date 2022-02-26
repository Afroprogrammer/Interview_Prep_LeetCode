package com.example.leetcode.googleQuestions;

import java.util.HashSet;

/**
 * Sliding window approach would help solve this
 * steps
 * -Create 3 int values and set it to zero, max_value, left_pointer right_pointer
 * -Create a hashset to used to store the individual characters
 * - create a while loop to run whiles the left pointer is lesser than the length of the string
 * - create and if statement to check if the hashset contains the character at the left pointer
 * -if it does not contain. add the character to the hashset and increment the left pointer by one find the max between the hashset size and the current max;
 * else remove the element from the hashset with the right pointer char value  increment the right pointer value by one
 *return the max_value;
 */
public class LongestSubstringWithoutRepChars3 {
    public int lengthOfLongestSubstring(String s) {
        int right_pointer = 0;
        int left_pointer = 0;
        int max_value = 0;
        HashSet <Character> hash_set = new HashSet();

        while (left_pointer < s.length())
        {
            if(!hash_set.contains(s.charAt(left_pointer)))
            {
                hash_set.add(s.charAt(left_pointer));
                left_pointer++;
                max_value = Math.max(hash_set.size(), max_value);
            }else {
                hash_set.remove(s.charAt(right_pointer));
                right_pointer ++;
            }
        }

        return max_value;
    }
}
