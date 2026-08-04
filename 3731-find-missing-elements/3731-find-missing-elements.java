class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i:nums){
            ts.add(i);
        }
        int min=ts.first();
        int max=ts.last();
        while(min<=max){
            if(!ts.contains(min)) list.add(min);
            min++;
        }



        return list;

        

    }
}