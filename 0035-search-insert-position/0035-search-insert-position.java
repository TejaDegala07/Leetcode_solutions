class Solution {
    public int searchInsert(int[] nums, int target) {
    int value=0;
    for(int i=0;i<nums.length;i++)
    {
        if(target<=nums[i])
        {
            value=i;
            break;
        }
        else{
            value=nums.length;
        }
    }
    
    return value;  
    }
}