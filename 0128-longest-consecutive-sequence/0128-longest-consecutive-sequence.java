class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int count=1,num=nums[0],ans=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==num+1)
            {
                num=nums[i];
                count++;
            }
            else if(nums[i]==num)
            {
                count+=0;

            }
            else if(nums[i]!=num+1)
            {
                
                count=1;
                num=nums[i];
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}