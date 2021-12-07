package hash_table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * We can shift a string by shifting each of its letters to its successive letter.
 *
 * For example, "abc" can be shifted to be "bcd".
 * We can keep shifting the string to form a sequence.
 *
 * For example, we can keep shifting "abc" to form the sequence: "abc" -> "bcd" -> ... -> "xyz".
 * Given an array of strings strings, group all strings[i] that belong to the same shifting sequence. You may return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: strings = ["abc","bcd","acef","xyz","az","ba","a","z"]
 * Output: [["acef"],["a","z"],["abc","bcd","xyz"],["az","ba"]]
 * Example 2:
 *
 * Input: strings = ["a"]
 * Output: [["a"]]
 *
 *
 * Constraints:
 *
 * 1 <= strings.length <= 200
 * 1 <= strings[i].length <= 50
 * strings[i] consists of lowercase English letters.
 */

public class GroupShiftedStrings {
    public List<List<String>> groupStrings(String[] strings) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str: strings) {
            String key = getKey(str);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private String getKey(String str) {
        char[] chars = str.toCharArray();
        StringBuilder key = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            int diff = chars[i] - chars[i - 1];
            if (diff > 0) key.append(diff);
            else key.append(diff + 26);
            key.append('#');
        }
        return key.toString();
    }
}
