class Solution {
    public int minAddToMakeValid(String s) {
        int dpth=0,ans=0;

        for(char ch:s.toCharArray()){
            if(ch=='(') dpth++;
            else{
                dpth--;
                if(dpth<0){
                    ans++;
                    dpth=0;
                }
            }
        }

        return ans+dpth;
    }
}