class Solution {
    public long countCommas(long n) {

        if(n<1000) return 0;

        long comas=0;
        long start = 1000;
        int level=1;

        while(start<=n){
            long end=start*1000-1;
            long count=Math.min(n,end)-start+1;

            if(count>0) comas+=count*level;

            start*=1000;
            level++;
        }
        return comas;
        
    }
}