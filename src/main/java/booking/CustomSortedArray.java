package booking;

import java.util.List;

public class CustomSortedArray {

    public static int moves(List<Integer> arr) {

        int[] array = new int[arr.size()];
        int i = 0;
        for (Integer integer: arr) {
            array[i] = integer;
            i++;
        }

        int mid = (array.length - 1) / 2;

        int counterStartToChange = 0;
        for (i = 0; i < mid; i++) {
            if (array[i] % 2 != 0) counterStartToChange ++;
        }

        int counterEndToChange = 0;
        for (i = array.length - 1; i > mid; i--) {
            if (array[i] % 2 == 0) counterEndToChange ++;
        }
        return Math.min(counterStartToChange, counterEndToChange);
    }
}
