package amazon;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 * Example 4:
 *
 * Input: x = 0
 * Output: 0
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 * Accepted
 * 1,847,465
 * Submissions
 * 7,0
 */

//Google
//Time Complexity: O(log(x)) Space Complexity: O(1)
public class ReverseInteger {

    public int reverse(int x) {

        int result = 0;

        while (x != 0) {
            System.out.println(Integer.MIN_VALUE % 10);
            int pop = x % 10; // "снимает" последнюю цифру у X
            x = x / 10; //удаляет эту цифру из x
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) return 0;// проверка на переполнение int
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            result = result * 10 + pop; //"добавляет" снятую цифру если проверка пройдена
        }

        return result;
    }
}
