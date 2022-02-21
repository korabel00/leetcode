package sliding_window;

// TC = O(N)
// SC = O(1)
public class MaxConsecutiveOnes3 {

    public int longestOnes(int[] nums, int k) {

        // let's have sliding window
        // in sliding window we cannot have zeros >  k

        int left = 0;
        int max = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeroCount++;
            while (zeroCount > k) {
               if (nums[left] == 0) {
                   zeroCount--;
               }
               left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
