class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0; // Count variable

        for (int i = 0; i < nums.length; i++) {
            // Check if number is equal to val
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}