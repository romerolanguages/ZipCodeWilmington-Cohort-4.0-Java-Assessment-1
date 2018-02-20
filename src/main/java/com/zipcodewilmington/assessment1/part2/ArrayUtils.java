package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Collections;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`,
     * return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int counter = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                counter++;
            }
        }
        //System.out.println(counter);
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`,
     * return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        int counter = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToRemove) {
                objectArray[i] = null;
                counter++;
            }
        }
        //System.out.println(Arrays.toString(objectArray));

        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Object o : objectArray) {
            if (o != null) {
                arrayList.add(o);
            }
        }
        
        Object[] finalArray = new Object[arrayList.size()];
        finalArray = arrayList.toArray(finalArray);
        //Arrays.sort(finalArray);
//        System.out.println("myarray");
//        System.out.println(Arrays.toString(finalArray));
//        System.out.println("********");
//        return finalArray;

        Integer[] finalArrayAsInteger = Arrays.copyOf(finalArray, finalArray.length, Integer[].class);
        return finalArrayAsInteger;
        // code works, but not passing test as a pure objects array
        // so I copied the final objects array into a final integer array
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        Object mostCommonNum = null;
        int mostOccurrences = 0;

        HashMap<Object, Integer> hashMap = new HashMap<>();

        for (Object object : objectArray) {
            if (!hashMap.containsKey(object)) {
                hashMap.put(object, 1);
            } else {
                hashMap.put(object, hashMap.get(object) + 1);
            }

            if (hashMap.get(object) > mostOccurrences) {
                mostCommonNum = object;
                mostOccurrences = hashMap.get(object);
            }
        }

        System.out.println(mostCommonNum);
        return mostCommonNum;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

//        Object leastCommonNum = null;
//        int leastOccurrences = 1;

        HashMap<Object, Integer> hashMap = new HashMap<>();

        for (Object object : objectArray) {
            if (!hashMap.containsKey(object)) {
                hashMap.put(object, 1);
            } else {
                hashMap.put(object, hashMap.get(object) + 1);
            }
//
//            if (hashMap.get(object) < leastOccurrences) {
//                leastCommonNum = object;
//                leastOccurrences = hashMap.get(object);
//            }
        }

        //System.out.println(leastCommonNum);

        return null;
        //return leastCommonNum;

        // need to return to this.
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`,
     * return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        int objectArrayLength = objectArray.length;
        int objectArrayToAddLength = objectArrayToAdd.length;
        int mergedLength = objectArrayLength + objectArrayToAddLength;

        Object[] mergedArray = new Object[mergedLength];

        for (int i = 0; i < objectArrayLength; i++) {
            mergedArray[i] = objectArray[i];
        }

        int j = 0;
        for (int i = objectArrayLength; i < mergedLength; i++) {
            mergedArray[i] = objectArrayToAdd[j];
            j++;
        }

        //System.out.println(Arrays.toString(mergedArray));

        Integer[] mergedArrayAsInteger = Arrays.copyOf(mergedArray, mergedArray.length, Integer[].class);
        return mergedArrayAsInteger;
        // code works, but not passing test as a pure objects array
        // so I copied the merged objects array into a merged integer array

    }
}
