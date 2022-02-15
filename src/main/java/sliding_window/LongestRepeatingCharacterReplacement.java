package sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * 424. Longest Repeating Character Replacement
 * Medium
 *
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 * Example 2:
 *
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 * The substring "BBBB" has the longest repeating letters, which is 4.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s consists of only uppercase English letters.
 * 0 <= k <= s.length
 */

// TC = O(N)
// SC = O(K), where K - number of distinct characters in string
public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {

        // the main technique is to calculate if length of the window - most frequent char <= k
        // if true move right pointer, if not move left pointer
        // every time update curr length and max length

        Map<Character, Integer> map = new HashMap<>();

        int currLen = 0;
        int maxLen = 0;
        int left = 0;
        int maxRepeatCount = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            maxRepeatCount = Math.max(maxRepeatCount, map.get(rightChar));
            while (right - left + 1 - maxRepeatCount > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.getOrDefault(leftChar, 0) - 1);
                left++;
            }
            currLen = right - left + 1;
            maxLen = Math.max(currLen, maxLen);
        }
        return maxLen;
    }
}
