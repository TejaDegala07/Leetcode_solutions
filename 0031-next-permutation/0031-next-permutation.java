class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int len=nums.length-1;

        for(int i=len-1;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                idx=i;
                break;
            }
        }
        if(idx==-1)
        {
            rev(nums,0,len);
        }
        else {
            for(int i=len;i>idx;i--)
            {
                if(nums[i]>nums[idx])
                {
                    int temp=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=temp;
                    break;
                }
            }
            rev(nums,idx+1,len);
        }

        
    }

    public static void rev(int[] nums,int idx,int lst)
    {
        int l=idx,r=lst;

        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}