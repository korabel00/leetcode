package two_pointers;

/**
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * <p>
 * Note that after backspacing an empty text, the text will continue empty.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 * Example 2:
 * <p>
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both s and t become "".
 * Example 3:
 * <p>
 * Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: s becomes "c" while t becomes "b".
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length, t.length <= 200
 * s and t only contain lowercase letters and '#' characters.
 * <p>
 * <p>
 * Follow up: Can you solve it in O(n) time and O(1) space?
 */

// TC = O(N + M) where N and M are the lengths of s and t
// SC = O(1)
public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {

        int pointerS = s.length() - 1;
        int pointerT = t.length() - 1;
        int backspaceSCount = 0;
        int backspaceTCount = 0;

        while (pointerS >= 0 || pointerT >= 0) {

            // Find the position of next possible char in s
            while (pointerS >= 0) {
                if (s.charAt(pointerS) == '#') {
                    backspaceSCount++;
                    pointerS--;
                } else if (backspaceSCount > 0) {
                    backspaceSCount--;
                    pointerS--;
                } else break;
            }

            // Find the position of next possible char in t
            while (pointerT >= 0) {
                if (t.charAt(pointerT) == '#') {
                    backspaceTCount++;
                    pointerT--;
                } else if (backspaceTCount > 0) {
                    backspaceTCount--;
                    pointerT--;
                } else break;
            }

            // If two characters are different
            if (pointerS >= 0 && pointerT >= 0 && s.charAt(pointerS) != t.charAt(pointerT)) {
                return false;
            }

            // If one pointer reached the end of a string and another doesn't -> false
            if ((pointerS >= 0) != (pointerT >= 0)) {
                return false;
            }
                pointerS--;
                pointerT--;
        }
        return true;
    }
}
