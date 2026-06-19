class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] index = new int[128];
        int maxLen = 0, left = 0;
        for (int right = 0; right < n; right++) {
            left = Math.max(index[s.charAt(right)], left);
            maxLen = Math.max(maxLen, right - left + 1);
            index[s.charAt(right)] = right + 1;
        }
        return maxLen;
    }
}
