//.............. Remove Duplicates from Sorted Array .................(26-leetcode)

class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0,count=1;
        for(int right=1;right<nums.length;right++){
            if(nums[left]==nums[right]) continue;
            else{
                nums[++left]=nums[right];
                count++;
            }
        }
        return count;
    }
}
