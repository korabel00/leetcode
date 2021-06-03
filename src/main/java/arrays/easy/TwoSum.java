package arrays.easy;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //Runtime - O(N * N), Space - O(1)
    public int[] findTwoSumByBruteForce(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i == j) {
                    j++;
                }
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //Runtime - O(N + M), Space - O(N)
    public int[] findTwoSumByMap(int[] nums, int target) {

        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            integerMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (integerMap.containsKey(target - nums[i]) && (i != integerMap.get(target - nums[i]))) {
                return new int[] {i, integerMap.get(target - nums[i])};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


