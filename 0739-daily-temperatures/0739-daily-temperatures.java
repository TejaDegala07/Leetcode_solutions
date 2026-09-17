class Solution {
    record Element(int val, int index) {}


    public int[] dailyTemperatures(int[] temp) {
        int[] ans=new int[temp.length];
        Stack<Element> st=new Stack<>();

        for(int i=0;i<temp.length;i++){
            int lst=0;
            while(!st.isEmpty() && st.peek().val()<temp[i]){
                lst=st.peek().index();
                st.pop();
                ans[lst]=i-lst;
            }
            st.push(new Element(temp[i],i));
        }
        return ans;
    }
}