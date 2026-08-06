class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
            int k=n;
            int prod=1;
            while(k>0){
                prod=prod*(k%10);
                k/=10;
            }
            if(prod%t==0) return n;
            n++;
        }
    }
}