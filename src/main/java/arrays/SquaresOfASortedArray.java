package arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 * <p>
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 * <p>
 * <p>
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */

// Facebook
public class SquaresOfASortedArray {

    // Time - O(N*N) Space - O(N)
    public int[] sortedSquaresBruteForce(int[] nums) {

        int[] squaredNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            squaredNums[i] = nums[i] * nums[i];
        }

        int temp;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (squaredNums[i] > squaredNums[j]) {
                    temp = squaredNums[i];
                    squaredNums[i] = squaredNums[j];
                    squaredNums[j] = temp;
                }
            }
        }
        return squaredNums;
    }

    // Time - O(N) Space - O(N)
    public int[] sortedSquares(int[] nums) {

        int[] squaredSortedNums = new int[nums.length];

        if (nums.length == 1) {
            squaredSortedNums[0] = nums[0] * nums[0];
            return squaredSortedNums;
        }

        int positivePointer = 0;
        //set up pointer to the first positive element position
        while (positivePointer < nums.length && nums[positivePointer] < 0)   {
            positivePointer++;
        }
        //set up another pointer to the first last negative element position
        int negativePointer = positivePointer - 1;
        int i = 0;

        while (negativePointer >= 0 && positivePointer < nums.length) {
            if (nums[negativePointer]*nums[negativePointer] < nums[positivePointer]*nums[positivePointer]) {
                squaredSortedNums[i] = nums[negativePointer]*nums[negativePointer];
                negativePointer--;
            } else {
                squaredSortedNums[i] = nums[positivePointer]*nums[positivePointer];
                positivePointer++;
            }
            i++;
        }
        // we have reached the end of an array in one case above, so copy the rest
        while (negativePointer >= 0) {
            squaredSortedNums[i] = nums[negativePointer]*nums[negativePointer];
            negativePointer--;
            i++;
        }

        while (positivePointer < nums.length) {
            squaredSortedNums[i] = nums[positivePointer]*nums[positivePointer];
            positivePointer++;
            i++;
        }

        return squaredSortedNums;
    }
}
