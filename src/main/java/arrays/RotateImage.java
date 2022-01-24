package arrays;

/**
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * <p>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 * Example 2:
 * <p>
 * <p>
 * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == matrix.length == matrix[i].length
 * 1 <= n <= 20
 * -1000 <= matrix[i][j] <= 1000
 */

// Time = O(N*N)
// Space = O(1)
public class RotateImage {

    public void rotate(int[][] matrix) {

        // in the first place we transpose the matrix like this:
        //  1 2 3       1 4 7
        //  4 5 6  ->   2 5 8
        //  7 8 9       3 6 9
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Than we flip the matrix horizontally like that:
        //  1 4 7       7 4 1
        //  2 5 8 ->    8 5 2
        //  3 6 9       9 6 3
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix.length - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        // And now we are done
    }
}
