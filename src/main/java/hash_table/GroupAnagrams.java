package hash_table;

import java.util.*;

public class GroupAnagrams {

    // Time = O(MNlogN), M- strs.lenght, N - average lenght if each elem in strs
    // Space = O(MN)
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List> map = new HashMap<>();

        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            map.putIfAbsent(key, new ArrayList());
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }

    // Time = O(MN), M- strs.lenght, N - average lenght if each elem in strs
    // Space = O(MN)
    public List<List<String>> groupAnagrams2(String[] strs) {

        Map<String, List> map = new HashMap<>();

        for (String str: strs) {
            int[] count = new int[26];
            char[] chars = str.toCharArray();
            for (char ch: chars) {
                count[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append('#').append(count[i]);
            }
            String key = sb.toString();

            map.putIfAbsent(key, new ArrayList());
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}
