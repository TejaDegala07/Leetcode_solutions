class Solution {
    public int numberOfSubstrings(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0,cnt=0;

        while(r<s.length() && l<s.length())
        {
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.containsKey('a') && map.containsKey('b') && map.containsKey('c')){
                cnt+=s.length()-r;
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
                l++;
            }
            r++;
        }
        return cnt;
        
    }
}