package heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.
 * <p>
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 * <p>
 * You must find a solution with a memory complexity better than O(n2).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
 * Output: 13
 * Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13
 * Example 2:
 * <p>
 * Input: matrix = [[-5]], k = 1
 * Output: -5
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == matrix.length == matrix[i].length
 * 1 <= n <= 300
 * -109 <= matrix[i][j] <= 109
 * All the rows and columns of matrix are guaranteed to be sorted in non-decreasing order.
 * 1 <= k <= n2
 * <p>
 * <p>
 * Follow up:
 * <p>
 * Could you solve the problem with a constant memory (i.e., O(1) memory complexity)?
 * Could you solve the problem in O(n) time complexity? The solution may be too advanced for an interview but you may find reading this paper fun.
 */

public class KthSmallestElementInASortedMatrix2 {

    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<MyHeapNode> minHeap = new PriorityQueue<>();

        int len = matrix.length;
        // Preparing our min-heap
        for (int row = 0; row < Math.min(len, k); row++) {
            // We add triplets of information for each cell
            minHeap.offer(new MyHeapNode(matrix[row][0], row, 0));
        }

        MyHeapNode element = minHeap.peek();
        while (k > 0) {
            // Extract-Min
            element = minHeap.poll();
            int row = element.getRow();
            int col = element.getCol();
            // If we have any new elements in the current row, add them
            if (col < len - 1) {
                minHeap.offer(new MyHeapNode(matrix[row][col + 1], row, col + 1));
            }
            k--;
        }
        return element.getVal();
    }
}
class MyHeapNode implements Comparable<MyHeapNode>{

    private final int val;

    public int getVal() {
        return val;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    private final int row;
    private final int col;

    public MyHeapNode(int val, int row, int col) {
        this.val = val;
        this.row = row;
        this.col = col;
    }

    @Override
    public int compareTo (MyHeapNode node) {
        return this.val - node.val;
    }
}

