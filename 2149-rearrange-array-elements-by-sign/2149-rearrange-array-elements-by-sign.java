class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        
        // Separate positives and negatives while preserving order
        for (int num : nums) {
            if (num > 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }
        
        int[] result = new int[nums.length];
        int pIdx = 0;  // Pointer for positives
        int nIdx = 0;  // Pointer for negatives
        
        // Alternate: positive at even index, negative at odd index
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = positives.get(pIdx++);
            } else {
                result[i] = negatives.get(nIdx++);
            }
        }
        
        return result;
    }
}