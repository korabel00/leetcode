package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.
 *
 *
 *
 * Example 1:
 *
 * Input: intervals = [[0,30],[5,10],[15,20]]
 * Output: 2
 * Example 2:
 *
 * Input: intervals = [[7,10],[2,4]]
 * Output: 1
 *
 *
 * Constraints:
 *
 * 1 <= intervals.length <= 104
 * 0 <= starti < endi <= 106
 */

// Time = O(NlogN for sorting + NlogN for inserting and deleting in heap within loop of N times)
// Space = O(N)
public class MeetingRoomsII {

    public int minMeetingRooms(int[][] intervals) {

        // edge cases
        if (intervals == null || intervals.length == 0) return 0;

        // Sort the intervals by start time so it goes like this:
        // [2,4], [7,10]
        Arrays.sort(intervals, (a,b) -> (a[0] - b[0]));

        // we are going to keep end time here like this: 4, 10
        // on the top minHeap is going to keep track of the earliest ending meeting
        PriorityQueue<Integer> minHeap =  new PriorityQueue<>();

        int minRoom = Integer.MIN_VALUE;
        for (int[] interval: intervals) {
            // if the start time of meeting later than the end time in minHeap (for example 7 > 4)
            // this means the previous meeting has ended and we don't need its end time anymore
            if (!minHeap.isEmpty() && interval[0] >= minHeap.peek()) {
                minHeap.poll();
            }
            // we add every ending time of the meeting like this: 4, 10
            minHeap.offer(interval[1]);
            minRoom = Math.max(minRoom, minHeap.size());
        }
        return minRoom;
    }
}
