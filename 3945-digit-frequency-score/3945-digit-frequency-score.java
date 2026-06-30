class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n>0)
        {
            int dum=n%10;
            map.put(dum,map.getOrDefault(dum,0)+1);
            n/=10;
        }
        int ans=0;
        for(int key:map.keySet())
        {
            ans+=key*map.get(key);
        }

        return ans;
        
        
    }
}