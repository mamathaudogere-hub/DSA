//............... Container With Most Water ................(11.java)

class Solution {
    public int maxArea(int[] height) {
        // brute force code
        // int result=0;
        // int n=height.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         int num=Math.min(height[i],height[j]);
        //         int m=j-i;
        //         result=Math.max(result,num*m);
        //     }
        // }
        // return result;

        int left=0,right=height.length-1;
        int result=0;
        while(left<right){
            int num=Math.min(height[left],height[right]);
            result=Math.max(result, num*(right-left));
            if(height[left]<height[right]) left++;
            else right--;
        }
        return result;
    }
}
