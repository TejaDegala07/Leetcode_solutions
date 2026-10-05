class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(') st.push(-1);
            else{
                if(st.peek()==-1) {
                    st.pop();
                    st.push(1);
                }
                else{
                    int num=0;
                    while(st.peek()!=-1) num+=st.pop();
                    st.pop();
                    st.push(num*2);
                }
            }
        }
        int ans=0;
        while(!st.isEmpty()) ans+=st.pop();
        return ans;
    }
}