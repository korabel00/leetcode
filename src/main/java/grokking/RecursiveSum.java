package grokking;

public class RecursiveSum {

    public static int calculateSum(int[] arr, int index) {

        if (index <= 0) return 0;
        else return arr[index - 1] + calculateSum(arr, index - 1);
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 8, 9, 12};
        int sum = calculateSum(arr, arr.length);

        System.out.println(sum);
    }
}
