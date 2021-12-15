package arrays;

/**
 * Given an array nums of non-negative integers, return an array consisting of all the even elements of nums, followed by all the odd elements of nums.
 *
 * You may return any answer array that satisfies this condition.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 *
 * Note:
 *
 * 1 <= nums.length <= 5000
 * 0 <= nums[i] <= 5000
 */

// Time O(N) Space O(1)
public class SortArrayByParity {

    public int[] sortArrayByParitySimple(int[] nums) {

        int evenNumberPointer = 0;
        int temp;

        //We go from the start and change numbers if its necessary
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] % 2 == 0){
                temp = nums[i];
                nums[i] = nums[evenNumberPointer];
                nums[evenNumberPointer] = temp;
                evenNumberPointer++;
            }
        }
        return nums;
    }

    public int[] sortArrayByParity(int[] nums) {

        int endPointer = nums.length - 1;
        int startPointer = 0;
        int temp;
        boolean changeRight;
        boolean changeLeft;

        //We go from the opposite directions of an array and if both numbers in the wrong place change them
        while (endPointer > startPointer) {
            if (nums[endPointer] % 2 == 0) {
                changeRight = true;
            } else {
                endPointer--;
                changeRight = false;
            }
            if (nums[startPointer] % 2 != 0) {
                changeLeft = true;
            } else {
                startPointer++;
                changeLeft = false;
            }
            if (changeLeft && changeRight) {
                temp = nums[startPointer];
                nums[startPointer] = nums[endPointer];
                nums[endPointer] = temp;
            }
        }
        return nums;
    }
}
