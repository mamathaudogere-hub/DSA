//...........Maximum Subarray........(53-leetcode)

class Solution {
    public int maxSubArray(int[] nums) {

        //Kadane's algorithm
        // int cur=0,sum=Integer.MIN_VALUE;
        // for(int n:nums){
        //     cur=Math.max(n,cur+n);
        //     sum=Math.max(sum,cur);
        // }
        // return sum;

        int cur=0,sum=Integer.MIN_VALUE;
        for(int num:nums){
            cur+=num;
            sum=Math.max(sum,cur);
            if(cur<0) cur=0;
        }
        return sum;
    }
}