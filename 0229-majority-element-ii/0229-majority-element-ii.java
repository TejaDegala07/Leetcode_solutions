class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int l=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int n:nums)
        {
            hm.put(n,hm.getOrDefault(n, 0) + 1);
        }
        for(int key:hm.keySet())
        {
            if(hm.get(key)>(l/3))
            {
                list.add(key);
            }
        }
        return list;
        
        
    }
}