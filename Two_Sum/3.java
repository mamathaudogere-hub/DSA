//.............. Longest Substring Without Repeating Characters ...............(3.java)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set<Character> set=new HashSet<>();
        // int left=0,right=0,maxlength=0;
        // for(right=0;right<s.length();right++){
        //     while(set.contains(s.charAt(right))){
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(s.charAt(right));
        //     maxlength=Math.max(maxlength,right-left+1);
        // }
        // return maxlength;

        Map<Character,Integer> map=new HashMap<>();
        int left=0,maxlength=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(map.containsKey(c)){
                left=Math.max(left,map.get(c)+1);
            }
            map.put(c,right);
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
