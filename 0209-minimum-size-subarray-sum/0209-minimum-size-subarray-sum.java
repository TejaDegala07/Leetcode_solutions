class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,l=0,r=0,ans=Integer.MAX_VALUE;

        while(r<nums.length){
            sum+=nums[r];
            while(sum>=target){
                ans=Math.min(ans,r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }
}