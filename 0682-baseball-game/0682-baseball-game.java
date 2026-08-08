class Solution {
    public int calPoints(String[] opr) {
       Stack<Integer> st=new Stack<>();
       for(String op:opr){
            if(op.equals("+")){
                int top=st.pop();
                int newsum=st.peek()+top;
                st.push(top);
                st.push(newsum);
            }
            else if(op.equals("D")){
                st.push(st.peek()*2);
            }
            else if(op.equals("C")) st.pop();
            else {
                st.push(Integer.parseInt(op));
            }
       }
       int ans=0;
       while(!st.isEmpty()){
        ans+=st.pop();
       }
        return ans;
    }
}