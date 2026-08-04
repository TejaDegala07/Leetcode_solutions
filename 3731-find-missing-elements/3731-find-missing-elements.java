class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Set<Integer> ts=new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            min=Math.min(i,min);
            max=Math.max(i,max);
            ts.add(i);
        }
        while(min<=max){
            if(!ts.contains(min)) list.add(min);
            min++;
        }



        return list;

        

    }
}