package hash_table;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Time = O(N) for filling HashMap +
//
class ValidWordAbbr {

    Map<String, Set<String>> map;

    public ValidWordAbbr(String[] dictionary) {

        map = new HashMap<>();

        for (String str: dictionary) {
            String key = getKey(str);
            map.putIfAbsent(key, new HashSet<>());
            map.get(key).add(str);
        }
    }

    public boolean isUnique(String word) {
        String key = getKey(word);
        if (!map.containsKey(key)) return true;
        else if (map.get(key).contains(word) && map.get(key).size() == 1) return true;
        else return false;
    }

    private String getKey(String str) {
        if(str.length() <= 2) return str;
        else return str.charAt(0) + String.valueOf(str.length()-2) + str.charAt(str.length()-1);
    }
}

/*apparently we don't need to store words in set if this set has more than 1 word - it is going to be false anyway
that's why we just to put "" instead as a sign of false;*/

class ValidWordAbbr2 {

    HashMap<String, String> map;
    public ValidWordAbbr2(String[] dictionary) {

        map = new HashMap<>();

        for(String str:dictionary){
            String key = getKey(str);
            // If there is more than one string belong to the same key
            // then the key will be invalid, we set the value to ""
            if(map.containsKey(key)){
                if(!map.get(key).equals(str)){
                    map.put(key, "");
                }
            }
            else{
                map.put(key, str);
            }
        }
    }

    public boolean isUnique(String word) {
        String key = getKey(word);
        return !map.containsKey(key)||map.get(key).equals(word);
    }

    String getKey(String str){
        if(str.length()<=2) return str;
        return str.charAt(0)+Integer.toString(str.length()-2)+str.charAt(str.length()-1);
    }
}
