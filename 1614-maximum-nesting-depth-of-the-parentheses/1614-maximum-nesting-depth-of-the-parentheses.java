class Solution {
    public int maxDepth(String s) {
        int max=0;
        int dum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                dum++;
            }
            else if(s.charAt(i)==')')
            {
                dum--;
            }

            if(dum>max)
            {
                max=dum;
            }
        }
        return max;
        
    }
}