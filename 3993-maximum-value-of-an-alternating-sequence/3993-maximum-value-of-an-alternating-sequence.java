class Solution {
    public long maximumValue(int n, int s1, int m) {
        if(n==1) return (long)s1;
        long s=(long)s1+((long)(n/2)*m)-(n/2)+1;
        return s;
    }
}