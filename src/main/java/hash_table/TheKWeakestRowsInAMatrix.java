package hash_table;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
 *
 * A row i is weaker than a row j if one of the following is true:
 *
 * The number of soldiers in row i is less than the number of soldiers in row j.
 * Both rows have the same number of soldiers and i < j.
 * Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
 *
 *
 *
 * Example 1:
 *
 * Input: mat =
 * [[1,1,0,0,0],
 *  [1,1,1,1,0],
 *  [1,0,0,0,0],
 *  [1,1,0,0,0],
 *  [1,1,1,1,1]],
 * k = 3
 * Output: [2,0,3]
 * Explanation:
 * The number of soldiers in each row is:
 * - Row 0: 2
 * - Row 1: 4
 * - Row 2: 1
 * - Row 3: 2
 * - Row 4: 5
 * The rows ordered from weakest to strongest are [2,0,3,1,4].
 * Example 2:
 *
 * Input: mat =
 * [[1,0,0,0],
 *  [1,1,1,1],
 *  [1,0,0,0],
 *  [1,0,0,0]],
 * k = 2
 * Output: [0,2]
 * Explanation:
 * The number of soldiers in each row is:
 * - Row 0: 1
 * - Row 1: 4
 * - Row 2: 1
 * - Row 3: 1
 * The rows ordered from weakest to strongest are [0,2,3,1].
 *
 *
 * Constraints:
 *
 * m == mat.length
 * n == mat[i].length
 * 2 <= n, m <= 100
 * 1 <= k <= m
 * matrix[i][j] is either 0 or 1.
 */

// Time = O(M(logN + 1 + logM) + k) for binary search where M - number of rows and N - number od columns +
// + 1 for contains + logM for inserting in TreeMap + k for output
// Space = O(M), where M - number of rows
public class TheKWeakestRowsInAMatrix {

    Map<Integer, List<Integer>> map = new TreeMap<>();

    public int[] kWeakestRows(int[][] mat, int k) {

        for (int i = 0; i < mat.length; i++) {
            int strength = binarySearch(mat[i]);
            if (!map.containsKey(strength)) {
                map.put(strength, new ArrayList<>());
            }
            map.get(strength).add(i);
        }

        int i = 0;
        int [] result = new int[k];
        for (Map.Entry<Integer, List<Integer>> entry: map.entrySet()) {
            for (int index: entry.getValue()) {
                result[i] = index;
                i++;
                if (i == k) break;
            }
            if (i == k) break;
        }
        return result;
    }

    private int binarySearch(int[] row) {

        int left = 0;
        int right = row.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (row[mid] == 1) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
