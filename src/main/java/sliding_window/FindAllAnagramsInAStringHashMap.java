package sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
// Time Limit Exceeded if you use new HashMap - better to slide the window
public class FindAllAnagramsInAStringHashMap {

    public List<Integer> findAnagrams(String s, String p) {

        // 1) iterate through p and create a map with occurrences of symbols
        Map<Character, Integer> pattern = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // edge case
        if (s.length() == 0 || s == null) return result;

        for (int i = 0; i < p.length(); i++) {
            Character ch = p.charAt(i);
            pattern.put(ch, pattern.getOrDefault(ch, 0) + 1);
        }

        // 2) iterate through s moving sliding window exactly of p size
        int pLength = p.length();
        int sLength = s.length();

        Map<Character, Integer> window = new HashMap<>();

        // i <= because for cases [abab] and [ab] expected result is [0,1,2]
        for (int i = 0; i < sLength; i++) {
            // just add next letter to the window
            Character ch = s.charAt(i);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // if the size of window exceeded remove left element from it
            if (i - pLength >= 0) {
                char characterToRemove = s.charAt(i - pLength);
                if (window.get(characterToRemove) == 1) {
                    window.remove(characterToRemove);
                }
                else  {
                    window.put(characterToRemove, window.getOrDefault(characterToRemove, 0) - 1);
                }
            }
            // 3) compare maps
            if (window.equals(pattern)) {
                result.add(i - pLength + 1);
            }
        }
        return result;
    }
}
