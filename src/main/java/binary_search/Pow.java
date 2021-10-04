package binary_search;

/**
 * mplement pow(x, n), which calculates x raised to the power n (i.e., xn).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 * Example 2:
 *
 * Input: x = 2.10000, n = 3
 * Output: 9.26100
 * Example 3:
 *
 * Input: x = 2.00000, n = -2
 * Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 *
 *
 * Constraints:
 *
 * -100.0 < x < 100.0
 * -231 <= n <= 231-1
 * -104 <= xn <= 104
 */

//medium
// Time log(N) Space O(N) - because of recursion
// 2^10 = 2^5*2^5 = 2^2*2^2*2
public class Pow {

    public double myPow(double x, int n) {

        if (n == 0) return 1;
        if (n == 1) return x;
        if (x == 0) return 0;

        // handling case when n = -2147483648
        if (n == Integer.MIN_VALUE){
            x = x * x;
            n = n / 2;
        }

        // if n is negative we put x in a denominator 2^-2 = 1/2^2 = 1/4 = 0 and make n positive
        if (n < 0) {
            n = - n;
            x = 1 / x;
        }

        if (n % 2 == 0) return myPow( x * x , n / 2);
        // in case n = 3, 5, or 7
        else return myPow(x * x , n / 2) * x;
    }
}
