package hash_table;

import java.util.*;

/**
 * Design a data structure that accepts a stream of integers and checks if it has a pair of integers that sum up to a particular value.
 *
 * Implement the TwoSum class:
 *
 * TwoSum() Initializes the TwoSum object, with an empty array initially.
 * void add(int number) Adds number to the data structure.
 * boolean find(int value) Returns true if there exists any pair of numbers whose sum is equal to value, otherwise, it returns false.
 *
 *
 * Example 1:
 *
 * Input
 * ["TwoSum", "add", "add", "add", "find", "find"]
 * [[], [1], [3], [5], [4], [7]]
 * Output
 * [null, null, null, null, true, false]
 *
 * Explanation
 * TwoSum twoSum = new TwoSum();
 * twoSum.add(1);   // [] --> [1]
 * twoSum.add(3);   // [1] --> [1,3]
 * twoSum.add(5);   // [1,3] --> [1,3,5]
 * twoSum.find(4);  // 1 + 3 = 4, return true
 * twoSum.find(7);  // No two integers sum up to 7, return false
 *
 *
 * Constraints:
 *
 * -105 <= number <= 105
 * -231 <= value <= 231 - 1
 * At most 104 calls will be made to add and find.
 */

// Time = O(1) for add() + O(N) for find()
// Space = O(N) in worst case
public class TwoSumDataStructureDesign2 {

    Map<Integer, Integer> map;

    public TwoSumDataStructureDesign2() {
        map = new HashMap<>();
    }

    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value) {

        for (Integer key: map.keySet()) {
            int complement = value - key;
            if (complement != key) {
                if (map.containsKey(complement)) return true;
            }
            else if (map.get(complement) > 1) return true;
        }
        return false;
    }
}
