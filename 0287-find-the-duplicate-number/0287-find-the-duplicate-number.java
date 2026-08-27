class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] arr=new boolean[nums.length+1];
        for(int i:nums){
            if(arr[i]) return i;
            arr[i]=true;
        }

        return -1;
    }
}