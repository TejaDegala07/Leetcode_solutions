class Solution {
    public int[] getConcatenation(int[] nums) {
        int size=nums.length;
        int[] ans=new int[size*2];
        for(int i=0;i<size;i++)
        {
            ans[i]=nums[i];
        }
        for(int i=0;i<size;i++)
        {
            ans[nums.length+i]=nums[i];
        }
        return ans;


        
    }
}