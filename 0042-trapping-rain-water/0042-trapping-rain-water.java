class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1,ml=0,mr=0;
        int water=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(height[left]>=ml) ml=height[left];
                else water+=ml-height[left];
                left++;
            }
            else{
                if(height[right]>=mr) mr=height[right];
                else water+=mr-height[right];
                right--;
            }
        }
        return water;
    }
}