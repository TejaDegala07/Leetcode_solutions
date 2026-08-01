class Solution {
    public int[] rotateElements(int[] nums, int k) {
        

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) list.add(nums[i]);
        }
        if(list.size()==0) return nums;
        k%=list.size();
        reverse(list, 0, k - 1);
        reverse(list, k, list.size() - 1);
        reverse(list, 0, list.size() - 1);
        int dum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) nums[i]=list.get(dum++);
        }
        return nums;
    }
    public static void reverse(ArrayList<Integer> list,int l,int r){

        while(l<r){
            int temp=list.get(l);
            list.set(l, list.get(r));
            list.set(r,temp);
            l++;
            r--;
        }
        
    }
}