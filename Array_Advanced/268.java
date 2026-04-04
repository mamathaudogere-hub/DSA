//.......... Missing Number .........(268-leetcode)

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for(int num:nums){
            if(num==res) res++;
        }
        return res;
    }
}