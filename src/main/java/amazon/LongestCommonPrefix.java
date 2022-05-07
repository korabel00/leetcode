package amazon;

//Amazon
//Time Complexity: O(N + M) Space Complexity: O(1)
public class LongestCommonPrefix {

    /**
     * start with the first word and cutting it if it doesn't fit others
     */
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {return "";}

        String commonPrefix = strs[0];

            for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(commonPrefix) != 0) {
                    commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                }
            }
        return commonPrefix;
    }

    /**
     * same as the previous one but we are trying to find the shortest word to start with.
     *
     */
    public String longestCommonPrefixTwo(String[] strs) {

        if (strs.length == 0) {return "";}

        String commonPrefix = strs[0];
        //assuming that the prefix cannot be longer that the shortest word finding it and using as a prefix;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < commonPrefix.length()) {
                commonPrefix = strs[i];
            }
        }

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
            }
        }
        return commonPrefix;
    }
}
