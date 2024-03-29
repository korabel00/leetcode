package heap;

import java.util.Collections;
import java.util.PriorityQueue;

// Time = O(NlogN - for filling up the heap + N-K for polling + N-K for iterating)
// Space = O(N)
public class KClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<HeapNode> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // fill the heap
        for (int[] point : points) {
            maxHeap.add(new HeapNode(point));
        }

        // cut the heap size to k moving out max elements by distance
        int heapSize = maxHeap.size();
        while (heapSize > k) {
            maxHeap.poll();
            heapSize--;
        }

        int [][] result = new int[maxHeap.size()][2];
        int i = 0;
        for (HeapNode node: maxHeap) {
            result[i][0] = node.getX();
            result[i][1] = node.getY();
            i++;
        }
        return result;
    }
}

class HeapNode implements Comparable<HeapNode>{

    private int distance;
    private int x;
    private int y;

    public HeapNode(int[] point) {
        this.x = point[0];
        this.y = point[1];
        this.distance = x*x + y*y;
    }

    public int getDistance() {
        return distance;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(HeapNode node) {
        return this.distance - node.distance;
    }
}


