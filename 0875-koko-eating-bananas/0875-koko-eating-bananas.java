class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=0;
        for(int i:piles)
        {
            r=Math.max(r,i);
        }
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(subf(mid,piles,h))
            {
                r=mid-1;
            }
            else 
            {
                l=mid+1;
            }
        }
        return l;

    }
    static boolean subf(int n,int[] arr,int h)
    {
        int k=0;
        boolean x=true;
        for(int i=0;i<arr.length;i++)
        {
            k +=(arr[i]+n-1) / n;
            if(k>h)return false;
        }
        return true;
    }

}