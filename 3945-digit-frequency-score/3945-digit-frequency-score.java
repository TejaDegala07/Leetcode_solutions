class Solution {
    public int digitFrequencyScore(int n) {
        int ans=0;
        while(n>0)
        {
            int dum=n%10;
            ans+=dum;
            n/=10;
        }
        
        return ans;
        
        
    }
}