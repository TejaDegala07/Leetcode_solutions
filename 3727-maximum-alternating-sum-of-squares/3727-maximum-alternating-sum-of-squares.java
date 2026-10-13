class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++) nums[i]=nums[i]*nums[i];
        Arrays.sort(nums);
        long sum1=0,sum2=0;

        for(int i=0;i<nums.length;i++){
            if(i<(nums.length/2))sum1+=nums[i];
            else sum2+=nums[i];
        }

       return sum2-sum1;
    }
}