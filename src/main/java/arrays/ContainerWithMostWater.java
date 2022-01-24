package arrays;

// Time = O(N)
// Space = O(1)
public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = countArea(left, right, height);

        while (left < right) {
            if (height[left] < height[right]) {
                left++;
                if (height[left] > height[left - 1]){
                    maxArea = Math.max(maxArea, countArea(left, right, height));
                }
            } else {
                right--;
                if (height[right] > height[right + 1]){
                    maxArea = Math.max(maxArea, countArea(left, right, height));
                }
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
