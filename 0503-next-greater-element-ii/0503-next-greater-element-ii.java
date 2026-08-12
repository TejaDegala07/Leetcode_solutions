class Solution {
    public int[] nextGreaterElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        
        for(int i=2*n-1;i>=0;i--){
            
                while(!st.isEmpty() && st.peek()<=nums[i%n]){
                    st.pop();
                }
                if(i<n){
                    if(st.isEmpty()) list.add(-1);
                else list.add(st.peek());
                }
            
            st.push(nums[i%n]);
            
        }
        Collections.reverse(list);
        int[] ans=new int[list.size()];
        int j=0;
        for(int i:list) ans[j++]=i;
        return  ans;
    }
}