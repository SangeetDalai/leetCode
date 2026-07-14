class Solution {
    public int singleNumber(int[] nums) {
        int xorSum = 0;
        for (int num : nums) {
            xorSum = xorSum^num;
        }
        return xorSum;
    }
}