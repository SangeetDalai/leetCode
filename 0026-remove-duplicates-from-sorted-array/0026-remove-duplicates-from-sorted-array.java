class Solution {
    public int removeDuplicates(int[] nums) {
        int low = 0;
        int count = 1;
        int high = 1;
        while(high<nums.length){
            if(nums[high]==nums[high-1]){
                high++;
                continue;
            }
            else{
                nums[low+1]=nums[high];
                low++;
                high++;
                count++;
            }
        }
         return count;
    }
}