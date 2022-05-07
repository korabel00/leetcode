package amazon;

// Time = O(N)
// Space = O(1)
public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = countArea(left, right, height);

        while (left < right) {
            maxArea = Math.max(maxArea, countArea(left, right, height));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    private int countArea (int left, int right, int[] height) {
        int width = right - left;
        int shortestLine = Math.min(height[left], height[right]);
        return shortestLine*width;
    }
}
