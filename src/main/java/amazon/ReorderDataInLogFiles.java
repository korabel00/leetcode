package amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * You are given an array of logs. Each log is a space-delimited string of words, where the first word is the identifier.
 * <p>
 * There are two types of logs:
 * <p>
 * Letter-logs: All words (except the identifier) consist of lowercase English letters.
 * Digit-logs: All words (except the identifier) consist of digits.
 * Reorder these logs so that:
 * <p>
 * The letter-logs come before all digit-logs.
 * The letter-logs are sorted lexicographically by their contents. If their contents are the same, then sort them lexicographically by their identifiers.
 * The digit-logs maintain their relative ordering.
 * Return the final order of the logs.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
 * Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
 * Explanation:
 * The letter-log contents are all different, so their ordering is "art can", "art zero", "own kit dig".
 * The digit-logs have a relative order of "dig1 8 1 5 1", "dig2 3 6".
 * Example 2:
 * <p>
 * Input: logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 * Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= logs.length <= 100
 * 3 <= logs[i].length <= 100
 * All the tokens of logs[i] are separated by a single space.
 * logs[i] is guaranteed to have an identifier and at least one word after the identifier.
 */

public class ReorderDataInLogFiles {

    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (s1, s2) -> {

            String[] split1 = s1.split(" ", 2);
            String[] split2 = s2.split(" ", 2);

            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

            if (isDigit1 && isDigit2) {
                // both digit-logs. So keep them in original order
                return 0;
            }
            if (isDigit1 && !isDigit2) {
                // first is digit, second is letter. bring letter to forward.
                return 1;
            } else if (!isDigit1 && isDigit2) {
                //first is letter, second is digit. keep them in this order.
                return -1;
            } else {
                // both are letter-logs.
                int comp = split1[1].compareTo(split2[1]);
                // if letter-logs are equal sort them by id
                if (comp == 0) return split1[0].compareTo(split2[0]);
                else return comp;
            }
        });
        return logs;
    }
}
