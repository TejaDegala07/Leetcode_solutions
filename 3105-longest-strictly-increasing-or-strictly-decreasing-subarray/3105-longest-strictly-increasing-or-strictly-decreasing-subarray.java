class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int minans=0,maxans=0,min=0,max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                max++;
                min=0;
            }
            else if(nums[i]<nums[i+1]){
                min++;
                max=0;
            }
            else if(nums[i]==nums[i+1]){
                max=0;
                min=0;
            }
            minans=Math.max(minans,min);
            maxans=Math.max(maxans,max);
        }
        return Math.max(maxans,minans)+1;
        
    }
}