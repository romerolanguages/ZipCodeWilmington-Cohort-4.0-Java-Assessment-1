package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        StringBuilder sb = new StringBuilder();

        String allUpperCase = str.toUpperCase();

        sb.append(allUpperCase.charAt(0) + str.substring(1, str.length()));

        //System.out.println(sb.toString());
        return sb.toString();
    }


    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);

        sb.reverse();
        //System.out.println(sb.toString());

        return sb.toString();
    }


    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder sb = new StringBuilder(str);

        String reverseStr = sb.reverse().toString();
        String allUpperCaseReverseStr = reverseStr.toUpperCase();

        sb.setLength(0);

        sb.append(allUpperCaseReverseStr.charAt(0) + reverseStr.substring(1, reverseStr.length()));
        //System.out.println(sb.toString());

        return sb.toString();
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        StringBuilder sb = new StringBuilder(str);

        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);

        //System.out.println(sb.toString());

        return sb.toString();
    }


    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }

        //System.out.println(new String(chars));

        return new String(chars);
    }
}
