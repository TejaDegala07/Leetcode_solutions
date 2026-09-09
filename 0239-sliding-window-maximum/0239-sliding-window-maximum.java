class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
        TreeMap<Integer,Integer> map=new TreeMap<>();

        int i=0,j=0,m=0;

            while(j<=k-1){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                j++;
            }
        while(j<=nums.length)
        {
            ans[m++]=map.lastKey();
            int cnt=map.get(nums[i]);
            if(cnt==1) map.remove(nums[i]);
            else map.put(nums[i],cnt-1);
            i++;
            if(j<nums.length){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                
            }
            j++;
        }

        return ans;
        
    }
}