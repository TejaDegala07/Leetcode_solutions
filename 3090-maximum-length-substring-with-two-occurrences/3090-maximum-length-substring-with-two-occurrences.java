class Solution {
    public int maximumLengthSubstring(String s) {
        int maxl=Integer.MIN_VALUE;
        int l=0,r=0;
        int[] freq=new int[26];
        while(r<s.length()){
            freq[s.charAt(r)-'a']++;
            while(freq[s.charAt(r)-'a']>2){
                freq[s.charAt(l)-'a']--;
                l++;
            }
            maxl=Math.max(maxl,r-l+1);
            r++;
        }
        return maxl;
    }
}