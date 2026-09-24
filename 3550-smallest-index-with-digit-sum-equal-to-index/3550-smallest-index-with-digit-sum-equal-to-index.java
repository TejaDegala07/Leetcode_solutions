class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int val=nums[i];
            int pali=0;
            while(val>0)
            {
                pali=pali+val%10;
                val=val/10;
            }

            if(pali==i)
            {
                return i;
            }
        }
        return -1;
        
    }
}