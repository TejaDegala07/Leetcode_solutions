class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        

        for(int i=min;i<=max;i++)
        {
            Boolean flag=false;

            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==i)
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                list.add(i);
            }
        }

        return list;

        

    }
}