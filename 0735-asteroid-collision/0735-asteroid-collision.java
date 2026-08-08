class Solution {
    public int[] asteroidCollision(int[] astroids) {
        Stack<Integer> st=new Stack<>();
        for(int a:astroids){
            while(!st.isEmpty() && a<0 && st.peek()>0){
                if(st.peek()<-a){
                    st.pop();
                }
                else if(st.peek()==-a){
                    st.pop();
                    a=0;
                }
                else a=0;
            }

            if(a!=0) st.push(a);
        }




        int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}