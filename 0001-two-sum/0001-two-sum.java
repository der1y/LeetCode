class Solution {
    public int[] twoSum(int[] nums, int target) {
        int pointer = 1;
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int x = pointer; x < nums.length; x++) {
                if (nums[i] + nums[x] == target) {
                    indices[0] = i;
                    indices[1] = x;
                    // return indices;
                }
            }
            pointer++;
        }
        return indices;
    }
}