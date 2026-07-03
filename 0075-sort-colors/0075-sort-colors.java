class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int num:nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int c0=hm.getOrDefault(0,0);
        int c1=hm.getOrDefault(1,0);
        int c2=hm.getOrDefault(2,0);
        int idx=0;

        while(c0-->0)nums[idx++]=0;
        while(c1-->0)nums[idx++]=1;
        while(c2-->0)nums[idx++]=2;
        
    }
}