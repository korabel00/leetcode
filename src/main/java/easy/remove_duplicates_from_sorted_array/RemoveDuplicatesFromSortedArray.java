package easy.remove_duplicates_from_sorted_array;

//Facebook
//Google
//Microsoft
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int pointerUniques = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[pointerUniques] = nums[i + 1];
                pointerUniques++;
            }
        }
        return pointerUniques;
    }
}
