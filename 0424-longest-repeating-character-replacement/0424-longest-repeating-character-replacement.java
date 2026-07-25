class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,ml=0,mf=0;
        int[] freq=new int[26];
        while(r<s.length()){
            freq[s.charAt(r)-'A']++;

            mf=Math.max(mf,freq[s.charAt(r)-'A']);

            if((r-l+1)-mf>k)
            {
                freq[s.charAt(l)-'A']--;
                mf=0;
                l++;
            }
            if((r-l+1)-mf<=k){
                ml=Math.max(ml,r-l+1);
            }
            r++;
        }
        return ml;
    }
}