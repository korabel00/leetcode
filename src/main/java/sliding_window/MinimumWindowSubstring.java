package sliding_window;

import java.util.HashMap;
import java.util.Map;

// TC = O(T + S)
// SC = O(T + S)
public class MinimumWindowSubstring {

        public String minWindow(String s, String t) {

            if (s.length() == 0 || t.length() == 0) {
                return "";
            }

            // Map which keeps a count of all the unique characters in t.
            Map<Character, Integer> mapT = new HashMap<>();
            for (int i = 0; i < t.length(); i++) {
                int count = mapT.getOrDefault(t.charAt(i), 0);
                mapT.put(t.charAt(i), count + 1);
            }

            // Number of unique characters in t, which need to be present in the desired window.
            int need = mapT.size();

            int left = 0;

            // have is used to keep track of how many unique characters in t
            // are present in the current window in its desired frequency.
            // e.g. if t is "AABC" then the window must have two A's, one B and one C.
            // Thus formed would be = 3 when all these conditions are met.
            int have = 0;

            // Dictionary which keeps a count of all the unique characters in the current window.
            Map<Character, Integer> windowCounts = new HashMap<>();

            // ans list of the form (left, right)
            int[] res = {-1, -1};
            int resLen = Integer.MAX_VALUE;

            for (int right = 0; right < s.length(); right++){

                // Add one character from the right to the window
                char c = s.charAt(right);
                int count = windowCounts.getOrDefault(c, 0);
                windowCounts.put(c, count + 1);

                // If the frequency of the current character added equals to the
                // desired count in t then increment the formed count by 1.
                if (mapT.containsKey(c) && windowCounts.get(c).intValue() == mapT.get(c).intValue()) {
                    have++;
                }

                // Try and contract the window till the point where it ceases to be 'desirable'.
                while (have == need) {

                    // Update the result
                    if (right - left + 1 < resLen) {
                        resLen = right - left + 1;
                        res[0] = left;
                        res[1] = right;
                    }

                    // pop from the left of our window
                    c = s.charAt(left);
                    windowCounts.put(c, windowCounts.get(c) - 1);
                    if (mapT.containsKey(c) && windowCounts.get(c) < mapT.get(c)) {
                        have--;
                    }

                    // Move the left pointer ahead, this would help to look for a new window.
                    left++;
                }
            }
            if (resLen != Integer.MAX_VALUE) return s.substring(res[0], res[1] + 1);
            else return "";
        }
}
