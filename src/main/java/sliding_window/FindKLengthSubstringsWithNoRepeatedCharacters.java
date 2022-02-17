package sliding_window;

import java.util.HashSet;
import java.util.Set;

/**
 * 1100. Find K-Length Substrings With No Repeated Characters
 * Medium
 *
 * Given a string s and an integer k, return the number of substrings in s of length k with no repeated characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "havefunonleetcode", k = 5
 * Output: 6
 * Explanation: There are 6 substrings they are: 'havef','avefu','vefun','efuno','etcod','tcode'.
 * Example 2:
 *
 * Input: s = "home", k = 5
 * Output: 0
 * Explanation: Notice k can be larger than the length of s. In this case, it is not possible to find any substring.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of lowercase English letters.
 * 1 <= k <= 104
 */

// TC = O(N)
// SC = O(1)
public class FindKLengthSubstringsWithNoRepeatedCharacters {

    public int numKLenSubstrNoRepeats(String s, int k) {

        int left = 0;
        int counter = 0;
        int[] freq = new int[26];

        for (int right = 0; right < s.length(); right++) {

            freq[s.charAt(right) - 'a']++;
            // if duplicate char in window -> shrink the window by increasing low bound.
            while (freq[s.charAt(right) - 'a'] > 1) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }

            // if the window wider than K -> shrink the window by increasing low bound.
            while (right - left + 1 > k) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            if (right - left + 1 == k) {
                counter++;
            }
        }
        return counter;
    }
}
