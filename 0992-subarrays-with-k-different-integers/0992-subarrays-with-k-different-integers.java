class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        int ans=sac(nums,k)-sac(nums,k-1);
        return ans; 
    }

    public static int sac(int[] nums,int k)
    {
        int l=0,r=0,count=0;
        Map<Integer,Integer> map=new HashMap<>();

        while(r<nums.length)
        {
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);

            while(map.size()>k)
            {
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0) map.remove(nums[l]);
                l++;
            }
            r++;
            count+=(r-l+1);
        }
        return count;
    }
}