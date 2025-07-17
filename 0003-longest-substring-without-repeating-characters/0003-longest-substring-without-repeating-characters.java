class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int currentLength = 1;
            for (int k = i + 1; k < n; k++) {
                if (!s.substring(i, k).contains(s.substring(k, k + 1))) {
                    currentLength++;
                } else {
                    break;
                }
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}