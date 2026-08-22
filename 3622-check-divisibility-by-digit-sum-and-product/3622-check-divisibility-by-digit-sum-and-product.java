class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int sum=0,prod=1;
        while(num>0){
            sum+=num%10;
            prod*=num%10;
            num/=10;
        }
        sum+=prod;
        return n%sum==0;
        
    }
}