package amazon;

/**
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 *
 * Input: s = "God Ding"
 * Output: "doG gniD"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 5 * 104
 * s contains printable ASCII characters.
 * s does not contain any leading or trailing spaces.
 * There is at least one word in s.
 * All the words in s are separated by a single space.
 */

public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {

        String[] strings = s.split(" ");
        StringBuilder words = new StringBuilder();

        for (String s1: strings) {
            StringBuilder word = new StringBuilder();
            for (int i = s1.length() - 1; i >= 0; i--) {
                word.append(s1.charAt(i));
            }
            words.append(word).append(" ");
        }
        return words.toString().trim();
    }
}
