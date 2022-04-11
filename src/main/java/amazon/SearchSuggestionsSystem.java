package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * You are given an array of strings products and a string searchWord.
 *
 * Design a system that suggests at most three product names from products after each character of searchWord is typed. Suggested products should have common prefix with searchWord. If there are more than three products with a common prefix return the three lexicographically minimums products.
 *
 * Return a list of lists of the suggested products after each character of searchWord is typed.
 *
 *
 *
 * Example 1:
 *
 * Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
 * Output: [
 * ["mobile","moneypot","monitor"],
 * ["mobile","moneypot","monitor"],
 * ["mouse","mousepad"],
 * ["mouse","mousepad"],
 * ["mouse","mousepad"]
 * ]
 * Explanation: products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"]
 * After typing m and mo all products match and we show user ["mobile","moneypot","monitor"]
 * After typing mou, mous and mouse the system suggests ["mouse","mousepad"]
 * Example 2:
 *
 * Input: products = ["havana"], searchWord = "havana"
 * Output: [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]
 * Example 3:
 *
 * Input: products = ["bags","baggage","banner","box","cloths"], searchWord = "bags"
 * Output: [["baggage","bags","banner"],["baggage","bags","banner"],["baggage","bags"],["bags"]]
 *
 *
 * Constraints:
 *
 * 1 <= products.length <= 1000
 * 1 <= products[i].length <= 3000
 * 1 <= sum(products[i].length) <= 2 * 104
 * All the strings of products are unique.
 * products[i] consists of lowercase English letters.
 * 1 <= searchWord.length <= 1000
 * searchWord consists of lowercase English letters.
 */

public class SearchSuggestionsSystem {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

// 1)  Sort the input products.
// 2)  Iterate each character of the searchWord adding it to the prefix to search for.
// 3)  After adding the current character to the prefix binary search for the prefix in the input.
// 4)  Add next 3 strings from the current binary search start index till the prefix remains same.

        // 1)  Sort the input products.
        Arrays.sort(products);
        List<List<String>> result = new LinkedList<>();
        String prefix = "";

        // 2)  Iterate each character of the searchWord adding it to the prefix to search for.
        for (char ch: searchWord.toCharArray()) {
            prefix += ch;
            // 3)  After adding the current character to the prefix binary search for the prefix in the input.
            int index = binarySearch(prefix, products);

            //For each prefix found add 3 results if they exist
            result.add(addResult(index, products, prefix));
        }
        return result;
    }

    List<String> addResult(int index, String[] products, String prefix) {

        List<String> subResult = new LinkedList<>();

        int endIndex = index + 3;
        while (index < endIndex && index < products.length) {

            //Only add to curResult if prefix match, otherwise break and return
            if (products[index].contains(prefix)) {
                subResult.add(products[index]);
            }
            index++;
        }
        return subResult;
    }

    //Binary search to find the first index of possible search result
    int binarySearch(String prefix, String[] products) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            //If found the exact match
            if (products[mid].equals(prefix)) return mid;

            //If mid word is lexicographically bigger than a target word
            else if (products[mid].compareTo(prefix) > 0) {
                right = mid - 1;
            //If mid word is lexicographically less than a target word
            } else left = mid + 1;
        }
        return left;
    }
}
