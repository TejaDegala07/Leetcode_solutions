class Solution {
    public int reverseDegree(String s) {

        int finalres=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int actidx=c-'a'+1;
            int revidx=27-actidx;
            int pro=(i+1)*revidx;
            finalres+=pro;
        }
        return finalres;
    }
}