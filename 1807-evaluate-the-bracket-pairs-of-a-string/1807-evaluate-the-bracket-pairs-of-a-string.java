class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> mpp=new HashMap<>();
        for(int l=0;l<knowledge.size();l++){
            mpp.put(knowledge.get(l).get(0),knowledge.get(l).get(1));
        }
        int i=0,j=0;
        StringBuilder ans=new StringBuilder();
        while(i<s.length()){
            if(s.charAt(i)=='('){
                j=i+1;
                while(s.charAt(j)!=')'){
                    j++;
                }
                String dummy=s.substring(i+1,j);
                if(mpp.containsKey(dummy)) ans.append(mpp.get(dummy));
                else ans.append("?");

                i=j+1;
            }
            else {
                ans.append(s.charAt(i));
                i++;
            }
        }
        return ans.toString();
    }
}