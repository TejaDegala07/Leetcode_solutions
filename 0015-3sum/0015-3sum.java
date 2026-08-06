class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();

        Set<List<Integer>> sl=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> li=new ArrayList<>(Arrays.asList(nums[i], nums[j], third));
                    Collections.sort(li);
                    if(!sl.contains(li)){
                        sl.add(li);
                        list.add(li);
                    }
                }
                set.add(nums[j]);
            }
        }
        return list;
        
    }
}