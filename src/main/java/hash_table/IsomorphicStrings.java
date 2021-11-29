package hash_table;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 5 * 104
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        String[] str1 = s.split("");
        String[] str2 = t.split("");

        for (int i = 0; i < str1.length; i++) {
            map1.putIfAbsent(str1[i], str2[i]);
            map2.putIfAbsent(str2[i], str1[i]);
        }

        System.out.println(map1);
        System.out.println(map2);

        for (int i = 0; i < str1.length; i++) {
            if (!map1.get(str1[i]).equals(str2[i]) || !map2.get(str2[i]).equals(str1[i])) return false;
        }
        return true;

    }

}
