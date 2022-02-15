package sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * 340. Longest Substring with At Most K Distinct Characters
 * Medium
 *
 * Given a string s and an integer k, return the length of the longest substring of s that contains at most k distinct characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "eceba", k = 2
 * Output: 3
 * Explanation: The substring is "ece" with length 3.
 * Example 2:
 *
 * Input: s = "aa", k = 1
 * Output: 2
 * Explanation: The substring is "aa" with length 2.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 5 * 104
 * 0 <= k <= 50
 */

// TC = O(N)
// SC = O(K)
public class LongestSubstringWithAtMostKDistinctCharacters {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();

        int currLen = 0;
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            while (map.size() > k) {
                if (map.get(s.charAt(left)) == 1) {
                    map.remove(s.charAt(left));
                } else {
                    map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
                }
                left++;
            }
            currLen = right - left + 1;
            maxLen = Math.max(currLen, maxLen);
        }
        return maxLen;
    }
}
