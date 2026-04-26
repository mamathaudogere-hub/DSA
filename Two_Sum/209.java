//............. Minimum Size Subarray Sum ...............(209-leetcode)

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,minlength=Integer.MAX_VALUE,left=0;
        for(int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            while(sum>=target){
                minlength=Math.min(minlength,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        return (minlength == Integer.MAX_VALUE) ? 0 : minlength;
    }
}
