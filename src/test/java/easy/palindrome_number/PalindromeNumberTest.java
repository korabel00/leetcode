package easy.palindrome_number;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

 Input: x = 121
 Output: true

 Input: x = -121
 Output: false
 Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

 Input: x = 10
 Output: false
 Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

 Input: x = -101
 Output: false
 *
 */

public class PalindromeNumberTest {

    @Test
    public void testPalindromeOne() {

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean actualValue = palindromeNumber.isPalindrome(121);
        Assert.assertTrue(actualValue, "Wrong answer");
    }

    @Test
    public void testPalindromeTwo() {

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean actualValue = palindromeNumber.isPalindrome(-121);
        Assert.assertFalse(actualValue, "Wrong answer");
    }

    @Test
    public void testPalindromeThree() {

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean actualValue = palindromeNumber.isPalindrome(10);
        Assert.assertFalse(actualValue, "Wrong answer");
    }
}