package com.example.leetcode.Strings;

/**
 * looped through the string once and compared the number of occurrences to the condition
 * to get the consecutive occurrences i had to reset the counter to zero whenever an a new character
 * came between
 */
public class StudentAttendanceRecord551 {
    public static boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;

        for (int i = 0; i < s.length(); i++){

            // for(char characters : characterArrays){
            if(s.charAt(i) == 'A')
            {
                absent ++;
            }

            if (s.charAt(i) == 'L')
            {
                late++;
            } else {
                late = 0;
            }
            if ( absent >= 2 || late == 3 ) return false;

        }
        return true;
    }

    public static void main(String[] args) {

        String words =  "PPALLP";
        System.out.println(checkRecord(words) );
        /**
         Input: s = "PPALLP"
         Output: true
         */
    }

}
