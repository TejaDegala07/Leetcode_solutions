class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0;
        int l=0,r=0,z=0;
        while(r<nums.length)
        {
            if(nums[r]==0) z++;
            while(z>k)
            {
                if(nums[l]==0)
                {
                    z--;
                }
                l++;
            }
            
                int len=r-l+1;
                maxlen=Math.max(len,maxlen);
            
            r++;
        }
        return maxlen;
        
        
    }
}