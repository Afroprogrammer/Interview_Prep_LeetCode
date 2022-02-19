package com.example.leetcode.Strings;

/**
 * create a variable maxCount and count to keep track of the strings
 * create a default char value of ' '; to reset when the previous
 * character is not the same as the current character
 * reset the  count to 1 if it does not repeat use Math.max to find the max value between the two
 *
 */
public class ConsecutiveCharacters {

        public static int maxPower(String s) {
            //set two pointers one for count and one for maxCount
            int count = 0;
            int maxCount = 0;
            char previous = ' ';
            for (int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == previous){
                    count ++;
                }
                else {
                    count = 1;
                    previous = c;

                }

                maxCount = Math.max(maxCount, count);
            }
            return maxCount;
        }

    public static void main(String[] args) {

            String word = "leetcode";
        System.out.println(maxPower(word));
        /**
         * Input: s = "leetcode"
         * Output: 2
         */
    }
    }

