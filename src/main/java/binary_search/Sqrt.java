package binary_search;

/**
 * Given a non-negative integer x, compute and return the square root of x.
 *
 * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
 *
 * Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 4
 * Output: 2
 * Example 2:
 *
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 *
 *
 * Constraints:
 *
 * 0 <= x <= 231 - 1
 *
 * Try exploring all integers. (Credits: @annujoshi)
 * Use the sorted property of integers to reduced the search space. (Credits: @annujoshi)
 */

//Space O(1) Time O(logN)
public class Sqrt {

    public int mySqrt(int x) {

        if (x < 2) return x;

        // We use long to prevent overflow. Also to achieve that we could use mid =
        long start = 1;
        long end = x;
        long mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid * mid == x) return (int) mid;
            else if (mid * mid > x) end = mid - 1;
            else if (mid * mid < x) start = mid + 1 ;
        }
        return (int) end;
    }
}
