class Solution {
    public int[][] merge(int[][] in) {
        int[][] ans=new int[in.length][2];
        Arrays.sort(in,(a,b)->Integer.compare(a[0],b[0]));        
        int z=0;
        int st=in[0][0];
        int end=in[0][1];
        for(int i=1;i<in.length;i++){
            if(in[i][0]<=end) end=Math.max(end,in[i][1]);
            else{
                ans[z][0]=st;
                ans[z][1]=end;
                st=in[i][0];
                end=in[i][1];
                z++;
            }
        }
        ans[z][0]=st;
        ans[z][1]=end;
        
        return Arrays.copyOf(ans,z+1);
    }
}