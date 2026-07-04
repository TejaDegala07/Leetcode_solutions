class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long ans=0;
        int i=nums.length-1;
        Arrays.sort(nums);

        while(k-->0)
        {
            ans += Math.max(1L * nums[i], 1L * nums[i] * mul);
            mul--;
            i--;
        }
        return ans;
        
    }
}