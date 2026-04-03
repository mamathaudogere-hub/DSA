//..........Contains Duplicate............(217-leetcode)

import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])) return true;
            mp.put(nums[i],1);
        }
        return false;

        // ......other way.........

        // Arrays.sort(nums);
        // int n=nums.length;
        // for(int i=1;i<n;i++){
        //     if(nums[i-1]==nums[i]) return true;
        // }
        // return false;
    }
}
