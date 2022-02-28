package grokking;

public class RecursiveBinarySearch {

    // Returns index of x if it is present in arr[l..
    // r], else return -1
    public static int binarySearch (int[] arr, int target, int left, int right)  {

       if (right >= left) {

           int mid = left + (right - left) / 2;

           if (arr[mid] == target) {
               return mid;
           } else if (arr[mid] > target) {
               return binarySearch(arr, target, left, mid - 1);
           } else {
               return binarySearch(arr, target, mid + 1, right);
           }
       }
       else return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        int[] arr = { 2, 3, 4, 10, 40 };
        int result = binarySearch(arr, 10, 0, arr.length - 1);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }
}
