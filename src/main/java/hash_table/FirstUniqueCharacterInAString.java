package hash_table;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcode"
 * Output: 0
 * Example 2:
 *
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 *
 * Input: s = "aabb"
 * Output: -1
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s consists of only lowercase English letters.
 */

public class FirstUniqueCharacterInAString {

    // 117 ms 47Mb memory
    // Time = O(N) since we go through the string of length N two times.
    // Space - O(1) because English alphabet contains 26 letters.
    public int firstUniqChar(String s) {

        String[] str = s.split("");
        Map<String, Integer> map  = new HashMap<>();

        for (String st1: str) {
            map.put(st1, map.getOrDefault(st1, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(str[i]) == 1) return i;
        }
        return -1;
    }

    // 21 ms 40Mb memory
    // Time = O(N) since we go through the string of length N two times.
    // Space - O(1) because English alphabet contains 26 letters.
    public int firstUniqChar2(String s) {

        char[] chrArr = s.toCharArray();
        Map<Character, Integer> map  = new HashMap<>();

        for (char chr: chrArr) {
            map.put(chr, map.getOrDefault(chr, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(chrArr[i]) == 1) return i;
        }
        return -1;
    }
}
