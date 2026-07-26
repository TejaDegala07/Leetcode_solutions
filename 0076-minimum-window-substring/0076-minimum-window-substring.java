class Solution {
    public String minWindow(String s, String t) {
        int[] hsh=new int[256];
        int l=0,r=0,minlen=(int)1e9,midx=-1,cnt=0;

        for(int i=0;i<t.length();i++){
            hsh[t.charAt(i)]++;
        }
        while(r<s.length()){
            if(hsh[s.charAt(r)]>0){
                cnt++;
                
            }
            hsh[s.charAt(r)]--;

            while(cnt==t.length()){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    midx=l;
                }
                hsh[s.charAt(l)]++;

                if(hsh[s.charAt(l)]>0){
                    cnt--;
                }
                l++;
            }
            r++;
        }
        if(midx==-1)return "";

        return s.substring(midx,midx+minlen);
        
    }
}