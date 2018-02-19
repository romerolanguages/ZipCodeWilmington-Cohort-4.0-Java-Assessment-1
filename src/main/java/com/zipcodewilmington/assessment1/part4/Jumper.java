package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        // k = flag height
        // j = jumpHeightOfTypeJ

        int kByJRemainder = k % j;
        int constantHeightJump = 1;

        int totalNumberOfJumps = 0;

        if (kByJRemainder == 0) {
            totalNumberOfJumps = k / j;
        } else {
            totalNumberOfJumps = ((k - kByJRemainder) / j) + (kByJRemainder / constantHeightJump);
        }

        return totalNumberOfJumps;
    }
}
