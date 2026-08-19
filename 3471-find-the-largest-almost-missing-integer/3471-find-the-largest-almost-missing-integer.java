class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=-1;
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        if(k==1){
            for(int i:nums){
                if(map.get(i)==1) ans=Math.max(ans,i);
            }
        }
        else if(k==nums.length){
            for(int i:nums) ans=Math.max(ans,i);
        }
        else{
            if(map.get(nums[0])>1 && map.get(nums[nums.length-1])>1){
                return -1;
            }
            else if(map.get(nums[0])>1) return nums[nums.length-1];
            else if(map.get(nums[nums.length-1])>1) return nums[0];
            else{
                return Math.max(nums[0],nums[nums.length-1]);
            }
        }
        return ans;
    }
}