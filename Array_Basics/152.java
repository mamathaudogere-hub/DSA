//........Maximum Product Subarray.............(152-leetcode)

class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int left=1,right=1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(left == 0)  left=1;
            if(right == 0)  right=1;
            left*=nums[i];
            right*=nums[n-i-1];
            maxi=Math.max(maxi,Math.max(left,right));
            
        }
        return maxi;
    }
}