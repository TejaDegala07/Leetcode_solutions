class Solution {
    public int evalRPN(String[] tokens) {
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(String tk:tokens){
            if(!st.isEmpty()){
                int pk=st.pop();
                if(tk.equals("+")) {
                    int nd=pk+st.peek();
                    st.pop();
                    st.push(nd);
                }
                else if(tk.equals("*")){
                    int nd=pk*st.peek();
                    st.pop();
                    st.push(nd);
                }
                else if(tk.equals("-")){
                    int nd=st.peek()-pk;
                    st.pop();
                    st.push(nd);
                }
                else if(tk.equals("/")){
                    int nd=st.peek()/pk;
                    st.pop();
                    st.push(nd);
                }
                
                else {
                    st.push(pk);
                    st.push(Integer.parseInt(tk));
                }
            }
            else{
                if(!tk.equals("+") && !tk.equals("*") &&!tk.equals("/")&&!tk.equals("-")){
                    st.push(Integer.parseInt(tk));
                }
            }
            
        }
        return st.peek();
    }
}