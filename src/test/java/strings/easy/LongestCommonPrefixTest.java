package strings.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Share
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * Constraints:
 *
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 */

public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefixOne() {

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String actualValue = longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"});
        Assert.assertEquals(actualValue, "fl", "Wrong answer");
    }

    @Test
    public void testLongestCommonPrefixTwo() {

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String actualValue = longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"});
        Assert.assertEquals(actualValue, "", "Wrong answer");
    }

    @Test
    public void testLongestCommonPrefixMethodTwo() {

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String actualValue = longestCommonPrefix.longestCommonPrefixTwo(new String[]{"flower","flow","flight"});
        Assert.assertEquals(actualValue, "fl", "Wrong answer");
    }

}