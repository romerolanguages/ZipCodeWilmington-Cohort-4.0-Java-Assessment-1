package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {

    public Integer countPalindromes(String input){

        // get arraylist of substrings first:
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                stringArrayList.add(input.substring(i, j + 1));
            }
        }

        //System.out.println(Arrays.toString(stringArrayList.toArray()));
        String test = "hello";
        //System.out.println(test + " " + reversed);

        // get number of palindromes from the above arraylist

        int palindromeCount = 0;
        StringBuilder sb = new StringBuilder();

        for (String string : stringArrayList) {
            if ( string.equals(sb.append(string).reverse().toString()) ) {
                palindromeCount++;
            }
            sb.setLength(0);
        }

        //String reversed = sb.append(test).reverse().toString();

        return palindromeCount;
    }
}
