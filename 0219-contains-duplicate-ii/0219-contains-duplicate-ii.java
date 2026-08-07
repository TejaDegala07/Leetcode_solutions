class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0,r=0;
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            if(map.get(nums[r])>1) return true;

            while(r-l>=k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0) map.remove(nums[l]);
                l++;
            }
            r++;
        }
        return false;
    }
}