package strings;

import java.util.HashMap;
import java.util.Map;

//Time Complexity: O(N) Space Complexity: O(N)
public class RomanToInteger {

    public int romanToInt(String s) {

        int result = 0;

        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        characterIntegerMap.put('I', 1);
        characterIntegerMap.put('V', 5);
        characterIntegerMap.put('X', 10);
        characterIntegerMap.put('L', 50);
        characterIntegerMap.put('C', 100);
        characterIntegerMap.put('D', 500);
        characterIntegerMap.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--){

            if (i == 0) {
                result += characterIntegerMap.get(s.charAt(i));
                break;
            }

            if (s.charAt(i - 1) == 'I' && s.charAt(i) == 'V') {
                result += 4;
                i--;
            } else if (s.charAt(i - 1) == 'I' && s.charAt(i) == 'X')  {
                result += 9;
                i--;
            } else if (s.charAt(i - 1) == 'X' && s.charAt(i) == 'L') {
                result += 40;
                i--;
            } else if (s.charAt(i - 1) == 'X' && s.charAt(i) == 'C') {
                result += 90;
                i--;
            } else if (s.charAt(i - 1) == 'C' && s.charAt(i) == 'D') {
                result += 400;
                i--;
            } else if (s.charAt(i - 1) == 'C' && s.charAt(i) == 'M') {
                result += 900;
                i--;
            } else {
                result += characterIntegerMap.get(s.charAt(i));
            }
        }
        return result;
    }

}
