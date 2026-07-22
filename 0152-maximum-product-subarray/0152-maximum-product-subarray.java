class Solution {
    public int maxProduct(int[] nums) {
        int prif=1,sufx=1,max=0,n=nums.length;
        if(n==1)return nums[0];

        for(int i=0;i<n;i++){
            if(prif==0)prif=1;
            if(sufx==0)sufx=1;

            prif*=nums[i];
            sufx*=nums[n-i-1];

            max=Math.max(max,Math.max(prif,sufx));
        }
        return max;
    }
}