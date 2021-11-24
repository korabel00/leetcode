package ubs;

import java.util.List;

class SplitIntoTwo {

    /*
     * Complete the 'splitIntoTwo' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int splitIntoTwo(List<Integer> arr) {
        // Write your code here

        int leftSum = arr.get(0);
        int rightSum = 0;

        for (Integer integer: arr) {
            rightSum += integer;
        }

        rightSum -= leftSum;

        int counter = 0;


        for (int i = 1; i < arr.size(); i++) {
            if (leftSum > rightSum) counter++;
            leftSum += arr.get(i);
            rightSum -= arr.get(i);
        }

        return counter;
    }
}