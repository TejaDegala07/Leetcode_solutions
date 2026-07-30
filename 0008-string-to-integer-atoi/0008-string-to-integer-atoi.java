class Solution {
    public int myAtoi(String s) {
        
        long ans=0;
        s=s.trim();
        if(s.length()==0) return 0;
        int dum=1;
        int i=0;
        if(s.charAt(i)=='-' || s.charAt(i)=='+') {
            if(s.charAt(i)=='-') dum=-1;
            i++;
        }

        while(i < s.length() && Character.isDigit(s.charAt(i))){
            ans*=10;
            ans+=s.charAt(i)-'0';
            if(dum==1 && ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(dum==-1 && -ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int) (dum*ans);
    }
}