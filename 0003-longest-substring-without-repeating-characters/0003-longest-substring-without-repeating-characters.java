class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;
        Map<Character, Integer> lastIndex = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char rc = s.charAt(right);

            if (lastIndex.containsKey(rc) && lastIndex.get(rc) >= left) {
                left = lastIndex.get(rc) + 1;  
            }

            lastIndex.put(rc, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}