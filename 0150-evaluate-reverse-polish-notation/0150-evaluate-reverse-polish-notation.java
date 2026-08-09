class Solution {
    public int evalRPN(String[] tokens) {
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(String tk:tokens){
            if(tk.equals("+")||tk.equals("-")
            ||tk.equals("/")||tk.equals("*")){
                int a=st.pop();
                int b=st.pop();
                if(tk.equals("+")) st.push(a+b);
                else if(tk.equals("-")) st.push(b-a);
                else if(tk.equals("*")) st.push(b*a);
                else if(tk.equals("/")) st.push(b/a);
            }
            else{
                st.push(Integer.parseInt(tk));
            }
            
        }
        return st.peek();
    }
}