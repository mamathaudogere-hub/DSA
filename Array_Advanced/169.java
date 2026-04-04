//.......... Majority Element ............(169-leetcode)

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int num=nums.length/2;
        return nums[num];

        // ........ other way .......
        // HashMap<Integer,Integer> map=new HashMap<>();
        // int n=nums.length;
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        //     if(map.get(num)>n/2) return num;
        // }
        // return -1;
    }
}