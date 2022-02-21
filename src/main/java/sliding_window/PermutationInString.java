package sliding_window;

import java.util.Arrays;

/**
 * 567. Permutation in String
 * Medium
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 *
 * In other words, return true if one of s1's permutations is the substring of s2.
 *
 *
 *
 * Example 1:
 *
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 * Example 2:
 *
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s1.length, s2.length <= 104
 * s1 and s2 consist of lowercase English letters.
 */

// TC = O(N)
// SC = O(1)
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        int[] arr = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            arr2[s2.charAt(right) - 'a']++;
            while (right - left + 1 > s1.length()) {
                arr2[s2.charAt(left) - 'a']--;
                left++;
            }
            if (Arrays.equals(arr,arr2)) return true;
        }
        return false;
    }
}
