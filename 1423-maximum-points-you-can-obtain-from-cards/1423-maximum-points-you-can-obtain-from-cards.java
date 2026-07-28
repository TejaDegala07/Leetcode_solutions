class Solution {
    public int maxScore(int[] cp, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cp[i];
        }
        int l=k-1,r=cp.length-1;
        int maxsum=sum;
        for(int i=0;i<k;i++){
            sum+=cp[r];
            sum-=cp[l];
            maxsum=Math.max(maxsum,sum);
            l--;
            r--;
        }

        return maxsum;
        
    }
}