package strings.easy;

import org.testng.Assert;
import org.testng.annotations.Test;
import strings.easy.ImplementStrStr;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Example 3:
 *
 * Input: haystack = "", needle = ""
 * Output: 0
 *
 *
 * Constraints:
 *
 * 0 <= haystack.length, needle.length <= 5 * 104
 * haystack and needle consist of only lower-case English characters.
 */

public class ImplementStrStrTest {

    @Test
    public void testStrStrFive() {

        ImplementStrStr implementStrStr = new ImplementStrStr();
        int actual = implementStrStr.strStr("mississippi","mississippi");
        int expected = 0;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testStrStrFour() {

        ImplementStrStr implementStrStr = new ImplementStrStr();
        int actual = implementStrStr.strStr("a", "a");
        int expected = 0;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testStrStr() {

        ImplementStrStr implementStrStr = new ImplementStrStr();
        int actual = implementStrStr.strStr("hello", "ll");
        int expected = 2;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testStrStrTwo() {

        ImplementStrStr implementStrStr = new ImplementStrStr();
        int actual = implementStrStr.strStr("aaaaa", "bba");
        int expected = -1;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testStrStrThree() {

        ImplementStrStr implementStrStr = new ImplementStrStr();
        int actual = implementStrStr.strStr("", "");
        int expected = 0;
        Assert.assertEquals(actual,expected);
    }
}