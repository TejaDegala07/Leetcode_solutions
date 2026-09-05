class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] mins=new int[nums.length];
        int min=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(nums[i],min);
            mins[i]=min;
        }
        
        int ans=Integer.MAX_VALUE;
        int maxv=Integer.MIN_VALUE;
        int pos=-1;
        for(int i=0;i<nums.length;i++){
            maxv=Math.max(maxv,nums[i]);
            // ans=Math.min(ans,maxv-mins[i]);
            int diff=maxv-mins[i];
            if(diff<=k) return i;
        }
        return -1;
    }
}