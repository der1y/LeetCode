class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxCount = 0;

        for (int num : numSet) {
            if(!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentCount = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentCount++;
                }

                maxCount = Math.max(maxCount, currentCount);
            }
        }
        return maxCount;
    }
}