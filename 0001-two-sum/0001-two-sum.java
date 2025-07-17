class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            for (int k = i; k < n; k++) {
                if (nums[k - i] + nums[k] == target) {
                    return new int[]{k - i, k};
                }
            }
        }
        return null;
    }
}