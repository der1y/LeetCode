class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seenChar = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!seenChar.contains(currentChar)) {
                seenChar.add(currentChar);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                seenChar.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}