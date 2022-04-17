package amazon;

/**
 * Give a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
 *
 * Substrings that occur multiple times are counted the number of times they occur.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "00110011"
 * Output: 6
 * Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
 * Notice that some of these substrings repeat and are counted the number of times they occur.
 * Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
 * Example 2:
 *
 * Input: s = "10101"
 * Output: 4
 * Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s[i] is either '0' or '1'.
 */

// TC - O(N)
// SC - O(N)
public class CountBinarySubstrings {

    public int countBinarySubstrings(String s) {

        // 1) basically for "00011100" we need to count min count between (000 and 111) Math.min(3,3)
        // 2) add it result = 3;
        // 3) then find min count between (111 and 00) Math.min(3,2)
        // 4) add it to result
        // in our case we first calculate all the counts them in one place like [3,3,2]
        // and then calculate minimum like that Math.min(groups[i-1], groups[i])

        int[] groups = new int[s.length()];
        int t = 0;
        groups[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                t++;
                groups[t] = 1;
            } else {
                groups[t]++;
            }
        }

        int result = 0;
        for (int i = 1; i <= t; i++) {
            result += Math.min(groups[i-1], groups[i]);
        }
        return result;
    }
}
