class Solution {
    public int strStr(String hs, String ndl) {
        if (ndl.length() == 0) return 0;

        if(hs.length()<ndl.length()) return -1;
        int l=0;

        while(l<=hs.length()-ndl.length()){
            String ss=hs.substring(l,hs.length());
            if(hs.startsWith(ndl,l))  return l;
            l++;

        }
        return -1;
    }
}