package com.example.leetcode.Strings;

/**
 * take the first element in the array and use it as a prefix
 * iterate over the rest of the words comparing it with the prefix
 * index of function would be useful and substring functions would be useful */
public class LongestCommonSubstring {
    public static  String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;

    }

    public static void main(String[] args) {
        String [] words = {"flower", "flow", "flee"};
        System.out.println(longestCommonPrefix(words));
    }
}