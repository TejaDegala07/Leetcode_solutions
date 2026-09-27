class Solution {
    public int sumOfPrimesInRange(int n) {
        int sum=0;
        int r=rev(n);
        int minr=Math.min(n,r),maxr=Math.max(n,r);
        for(int i=minr;i<=maxr;i++){
            if(isprime(i)) sum+=i;
        }

        return sum;
    }
    public boolean isprime(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;

        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0) return false;
        }

        return true;
    }
    public int rev(int n){
        int r=0;
        while(n>0){
            r=r*10+n%10;
            n/=10;
        }

        return r;
    }
}