class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        int left = 0;
        int windowSum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            windowSum += arr[right];                        

            while (windowSum >= target) {                  
                minLen = Math.min(minLen, right - left + 1);
                windowSum -= arr[left];                    
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}