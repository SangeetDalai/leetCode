class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        // Add all numbers to a set for O(1) lookup
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int maxLength = 0;
        
        for (int num : numSet) {  // Iterate over the SET, not the array
            // Only start counting if this is the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;
                
                // Count consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;
    }
}