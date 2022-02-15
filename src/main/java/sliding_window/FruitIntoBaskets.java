package sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * 904. Fruit Into Baskets
 * Medium
 *
 * Share
 * You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
 *
 * You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
 *
 * You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
 * Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
 * Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
 * Given the integer array fruits, return the maximum number of fruits you can pick.
 *
 *
 *
 * Example 1:
 *
 * Input: fruits = [1,2,1]
 * Output: 3
 * Explanation: We can pick from all 3 trees.
 * Example 2:
 *
 * Input: fruits = [0,1,2,2]
 * Output: 3
 * Explanation: We can pick from trees [1,2,2].
 * If we had started at the first tree, we would only pick from trees [0,1].
 * Example 3:
 *
 * Input: fruits = [1,2,3,2,2]
 * Output: 4
 * Explanation: We can pick from trees [2,3,2,2].
 * If we had started at the first tree, we would only pick from trees [1,2].
 */

// TC = O(N)
// SC = O(1)
public class FruitIntoBaskets {

    public int totalFruit(int[] fruits) {

        Map<Integer, Integer> map = new HashMap<>();

        int currLen = 0;
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < fruits.length; right++) {

            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while (map.size() > 2) {
                if (map.get(fruits[left]) == 1) {
                    map.remove(fruits[left]);
                } else {
                    map.put(fruits[left], map.getOrDefault(fruits[left], 0) - 1);
                }
                left++;
            }
            currLen = right - left + 1;
            maxLen = Math.max(currLen, maxLen);
        }
        return maxLen;
    }
}
