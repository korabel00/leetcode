package amazon;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 *
 * Input: s = ""
 * Output: 0
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */

// Time = O (N)
// Space = O (1) 26 characters
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> set = new HashSet<>(26);

        while (right < s.length()) {
            char curr = s.charAt(right);
            if (!set.contains(curr)) {
                set.add(curr);
                right++;
                max = Math.max(max, set.size());
            }
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
