package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence,
     * return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {

        String[] sentenceArray = sentence.split(" ");

        return sentenceArray;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence,
     * return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {

        String[] sentenceArray = sentence.split(" ");
        //System.out.println(sentenceArray[0]);
        return sentenceArray[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence,
     * return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {

        String[] sentenceArray = sentence.split(" ");
        //System.out.println(sentenceArray[0]);
        String firstWord = sentenceArray[0];

        StringBuilder sbReverse = new StringBuilder(firstWord).reverse();

        /**
        String expected = "leoN";  // this would be the "identical contents in reverse order
         */

        return sbReverse.toString();
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * and the first character capitalized
     *
     * given a string containing words delimited by spaces, representative of a sentence,
     * return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {

        String[] sentenceArray = sentence.split(" ");

        String firstWord = sentenceArray[0];

        StringBuilder sb = new StringBuilder(firstWord);
        String firstWordReversed = sb.reverse().toString();
        String firstWordReversedUpper = firstWordReversed.toUpperCase();

        sb.setLength(0);

        sb.append(firstWordReversedUpper.charAt(0));
        sb.append(firstWordReversed.substring(1, firstWordReversed.length()));

        String finalWord = sb.toString();
        return finalWord;

    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i != index) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

}
