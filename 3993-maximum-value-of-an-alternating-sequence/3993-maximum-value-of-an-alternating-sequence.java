class Solution {
    public long maximumValue(int n, int s1, int m) {
        if(n==1) return (long)s1;
        long k=n/2;
        long s=(long)s1+k*m-k+1;
        return s;
    }
}