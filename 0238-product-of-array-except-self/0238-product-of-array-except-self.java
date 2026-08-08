class Solution {
    public int[] productExceptSelf(int[] nums) {
    int prod=1,pfz=1,zc=0;
    


    for(int i=0;i<nums.length;i++)
    {
        prod*=nums[i];
        if(nums[i]!=0) pfz*=nums[i];
        if(nums[i]==0) zc++;

    } 

    for(int i=0;i<nums.length;i++)
    {
         if (zc > 1) {
                nums[i] = 0;
            }
            else if (zc == 1) {

                if (nums[i] == 0)
                    nums[i] = pfz;
                else
                    nums[i] = 0;
            }
            else {
                nums[i] = prod / nums[i];
            }
    }   

    return nums;    
        
        

        
    }
}