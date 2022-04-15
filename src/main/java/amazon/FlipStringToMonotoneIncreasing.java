package amazon;

/**
 * A binary string is monotone increasing if it consists of some number of 0's (possibly none), followed by some number of 1's (also possibly none).
 *
 * You are given a binary string s. You can flip s[i] changing it from 0 to 1 or from 1 to 0.
 *
 * Return the minimum number of flips to make s monotone increasing.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "00110"
 * Output: 1
 * Explanation: We flip the last digit to get 00111.
 * Example 2:
 *
 * Input: s = "010110"
 * Output: 2
 * Explanation: We flip to get 011111, or alternatively 000111.
 * Example 3:
 *
 * Input: s = "00011000"
 * Output: 2
 * Explanation: We flip to get 00000000.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s[i] is either '0' or '1'.
 */

public class FlipStringToMonotoneIncreasing {

    public int minFlipsMonoIncr(String s) {

        // 1) Keep track of number of 1's in ones (prefix).
        // We are skipping 0's until we encounter the first 1 by performing Math.min(ones,flips);
        // 2) Any 0 that comes after we encounter 1 can be a potential candidate for flip. Keep track of it in flips.

        int ones = 0;
        int flips = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1')
                ones++;
            else
                flips++;
            flips = Math.min(ones,flips);
        }
        return flips;
    }
}
