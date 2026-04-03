//...........TWO SUM............(1-LEETCODE)

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n=nums.length,key;
        for(int i=0;i<n;i++){
            key=target-nums[i];
            if(mp.containsKey(key)){
                return new int[]{mp.get(key),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}