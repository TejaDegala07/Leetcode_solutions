class Solution {
    public int sumOfSquares(int[] nums) {

        int sq=0;
        for(int i=0;i<nums.length;i++)
        {
            int k=nums.length;
            if(k%(i+1)==0)
            {
                sq=sq+(nums[i] * nums[i]);
            }
        }
        return sq;
        
    }
}