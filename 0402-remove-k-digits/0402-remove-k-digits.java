class Solution {
    public String removeKdigits(String num, int k) {
        if(k>=num.length()) return "0";
        Stack<Character> st=new Stack<>();

        for(char ch:num.toCharArray()){
            int n=ch-'0';
            while(!st.isEmpty()&& (st.peek()-'0')>n && k>0) {
                st.pop();
                k--;
            }
            st.push(ch);
            
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder ans=new StringBuilder();
        while(!st.empty()){
            ans.append(st.peek());
            st.pop();
        }
        ans.reverse();
        while(ans.length()>0 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        if(ans.length()==0) return "0";
        return ans.toString();        

    }
}