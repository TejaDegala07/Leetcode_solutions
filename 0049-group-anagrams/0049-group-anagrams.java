class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> map=new HashMap<>();
        for(String st:strs){
            int[] freq=new int[26];
            for(char ch:st.toCharArray()){
                freq[ch-'a']++;
            }
            String key=Arrays.toString(freq);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(st);
        }
        
        return new ArrayList(map.values());
    }
}