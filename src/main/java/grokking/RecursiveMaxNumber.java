package grokking;

public class RecursiveMaxNumber {

    public static int getMaxNumber(int[] arr, int num) {

        int max = 0;
        if (num <= 2) return Math.max(arr[0], arr[1]);
        else return Math.max(arr[num - 1],getMaxNumber(arr, num - 1));
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 8, 9, 12};
        int sum = getMaxNumber(arr, arr.length);

        System.out.println(sum);
    }
}
