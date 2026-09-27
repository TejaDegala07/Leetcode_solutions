class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder(s);
        Stack<Integer> idx=new Stack<>();
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch=='(') idx.push(i);
            else if(ch==')'){
                int start=idx.pop();
                reverse(sb,start+1,i-1);
                sb.deleteCharAt(i);
                sb.deleteCharAt(start);
                i-=2;
            }
        }
        return sb.toString();
    }
    public void reverse(StringBuilder sb,int start,int end){
        while(start<end){
            char temp=sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
    }
}