package booking;

import java.util.Arrays;
import java.util.List;

public class FindTheNumber {

    public static String findNumber(List<Integer> arr, int k) {

        int[] array = new int[arr.size()];
        int i = 0;
        for (Integer integer: arr) {
            array[i] = integer;
            i++;
        }

        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == k) return "YES";
            else if (array[mid] > k) right = mid - 1;
            else left = mid + 1;
        }
        return "NO";
    }
}
