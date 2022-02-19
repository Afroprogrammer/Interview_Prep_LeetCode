package com.example.leetcode;

public class Test {


    public static void main(String[] args) {
        // finding the number of spaces
        String text = "Hello world";
       char [] textArray = text.toCharArray();
        int spaces = 0;
        int words = text.split("\\s").length;
        int spacesToReplace = words -1 ;
        for (char c : text.toCharArray()) {
            if (c == ' ') spaces++;
        }
        //divide the number of spaces per spaces available
        int spacesInbetween = spaces / spacesToReplace ;
    }
}
