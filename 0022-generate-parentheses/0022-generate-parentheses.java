class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate("",n,ans);
        return ans;
    }
    void generate(String current,int n,List<String> ans){
        if(current.length()==2*n){
            if(isValid(current)) ans.add(current);
            return;
        }
        generate(current+')',n,ans);
        generate(current+'(',n,ans);

    }
    boolean isValid(String current){
        int depth=0;
        for(char ch:current.toCharArray()){
            if(ch=='(')depth++;
            else depth--;

            if(depth<0) return false;
        }
        if(depth==0) return true;

        return false;
        
    }
}