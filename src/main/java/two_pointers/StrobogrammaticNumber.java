package two_pointers;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string num which represents an integer, return true if num is a strobogrammatic number.
 *
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
 *
 *
 *
 * Example 1:
 *
 * Input: num = "69"
 * Output: true
 * Example 2:
 *
 * Input: num = "88"
 * Output: true
 * Example 3:
 *
 * Input: num = "962"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= num.length <= 50
 * num consists of only digits.
 * num does not contain any leading zeros except for zero itself.
 */

// TC = O(N)
// SC = O(1)
public class StrobogrammaticNumber {

    public boolean isStrobogrammatic(String num) {

        if (num == null) return false;

        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('9', '6');
        map.put('6', '9');

        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);
            if (!map.containsKey(leftChar) || !map.containsKey(rightChar)) return false;
            if (map.get(leftChar) != rightChar) return false;
            left ++;
            right --;
        }
        return true;
    }
}
