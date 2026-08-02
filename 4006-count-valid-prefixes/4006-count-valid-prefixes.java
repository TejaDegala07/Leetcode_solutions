class Solution {
    public int countValidPrefixes(String s) {
        int ans=0,zc=0,oc=0;
        for(char ch:s.toCharArray()){
            if(ch=='0') zc++;
            else oc++;

            if(Math.abs(zc-oc)<=1) ans++;
        }
        return ans;
    }
}