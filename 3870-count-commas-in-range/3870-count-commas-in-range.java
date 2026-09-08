class Solution {
    public int countCommas(int n) {
        if(n<1000 && n>=1) return 0;

        long comas=0;
        long start=1000;
        int level=1;

        while(start<=n){
            long end=start*1000-1;
            long count=Math.min(n,end)-start+1;

            if(count>0) comas+=count*level;

            start*=1000;
            level++;
        }

        return (int) comas;
        
        
    }
}