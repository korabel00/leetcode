package arrays;

import java.util.Arrays;
import java.util.LinkedList;

// TC = O(N logN) for sorting and O(N) or going through all intervals
// SC = O(logN) for sorting as well
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        if (intervals.length < 1) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                // we use Math.max instead of just assigning intervals[1] for cases like this:
                // [[1,4],[2,3]] when an interval is completely consumed by other (both start and end points of interval are less)
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
