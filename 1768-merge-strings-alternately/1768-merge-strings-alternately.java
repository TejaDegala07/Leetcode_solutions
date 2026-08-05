class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int w1=word1.length(),w2=word2.length();
        int l=0;
        int ml=Math.max(w1,w2);
        while(l<ml){
            if(l<w1){
                sb.append(word1.charAt(l));
            }
            if(l<w2){
                sb.append(word2.charAt(l));
            }
            l++;
        }
        return sb.toString();
        
    }
}