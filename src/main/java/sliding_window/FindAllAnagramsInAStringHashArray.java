package sliding_window;

import java.util.*;

/**
 * 438. Find All Anagrams in a String
 * Medium
 *
 * 6706
 *
 * 244
 *
 * Add to List
 *
 * Share
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * Example 2:
 *
 * Input: s = "abab", p = "ab"
 * Output: [0,1,2]
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 *
 *
 * Constraints:
 *
 * 1 <= s.length, p.length <= 3 * 104
 * s and p consist of lowercase English letters.
 */

// TC = O(N + M) since it's one pass along both strings.
// SC = O(1) because pCount and sCount contain not more than 26 elements.
public class FindAllAnagramsInAStringHashArray {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        // edge case
        if (s.length() == 0) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // we want to use an array to count occurrences of every char in string p
        // 'a' - 'a' would give us 0 index, 'b' - 'a' would give us 1 index
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }

        // using sliding window
        int pLength = p.length();
        int sLength = s.length();

        // 2) iterate through s moving sliding window exactly of p size
        for (int i = 0; i < sLength; ++i) {
            // just add next letter to the window
            sCount[(s.charAt(i) - 'a')]++;
            // if the size of window exceeded remove left element from it
            if (i - pLength >= 0) {
                sCount[(s.charAt(i - pLength) - 'a')]--;
            }
            // compare array in the sliding window
            // with the reference array
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - pLength + 1);
            }
        }
        return result;
    }
}
