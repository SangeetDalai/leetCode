class Solution {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        int left = 0;
        int maxLen = -1;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char rc = s.charAt(right);
            map.put(rc, map.getOrDefault(rc, 0) + 1);

            while (map.size() > k) {
                char lc = s.charAt(left);
                map.put(lc, map.get(lc) - 1);
                if (map.get(lc) == 0) map.remove(lc);  
                left++;
            }

            if (map.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}