package easy.remove_element;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int counterOfUniqueNumbers = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counterOfUniqueNumbers] = nums[i];
                counterOfUniqueNumbers++;
            }
        }
        return counterOfUniqueNumbers;
    }
}
