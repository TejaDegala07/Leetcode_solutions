class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int tsum=0,rep=0;
        Set<Integer> set=new HashSet<>();
        for(int i:nums) {
            tsum+=i;
            if(!set.add(i)) rep=i;
        }
        return new int[]{rep,sum-(tsum-rep)};
    }
}