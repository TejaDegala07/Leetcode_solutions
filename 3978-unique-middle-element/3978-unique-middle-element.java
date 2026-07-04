class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        if(nums.length==1) return true;
        int mid=(nums.length-1)/2;
        int midele=nums[mid],count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==midele) count++;
        }      
        return count==1;
    }
}