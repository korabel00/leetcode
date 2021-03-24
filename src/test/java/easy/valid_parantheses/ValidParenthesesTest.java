package easy.valid_parantheses;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 * Example 4:
 *
 * Input: s = "([)]"
 * Output: false
 * Example 5:
 *
 * Input: s = "{[]}"
 * Output: true
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class ValidParenthesesTest {

    @Test
    public void testIsValidOne() {

        ValidParentheses validParentheses = new ValidParentheses();
        boolean actualResult = validParentheses.isValid("()");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void testIsValidTwo() {

        ValidParentheses validParentheses = new ValidParentheses();
        boolean actualResult = validParentheses.isValid("()[]{}");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void testIsValidThree() {

        ValidParentheses validParentheses = new ValidParentheses();
        boolean actualResult = validParentheses.isValid("(]");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void testIsValidFour() {

        ValidParentheses validParentheses = new ValidParentheses();
        boolean actualResult = validParentheses.isValid("([)]");
        Assert.assertFalse(actualResult);
    }

    @Test
    public void testIsValidFive() {

        ValidParentheses validParentheses = new ValidParentheses();
        boolean actualResult = validParentheses.isValid("{[]}");
        Assert.assertTrue(actualResult);
    }
}