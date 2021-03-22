package easy.palindrome_number;

//Time Complexity: O(N) Space Complexity: O(1)
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        int pop;
        int result = 0;
        int initial = x;

        if (x < 0) {return false;}

        while (x != 0) {
            pop = x % 10;
            x = x / 10;
            result = result*10 + pop;
        }
        return result == initial;
    }
}
