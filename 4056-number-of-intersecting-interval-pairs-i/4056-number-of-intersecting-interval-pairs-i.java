class Solution {
    public int countIntersectingIntervals(int[][] inter) {
        int cnt=0;
        for(int i=0;i<inter.length;i++){
            for(int j=i+1;j<inter.length;j++){
                // if(inter[i][0]>=inter[j][0] && inter[i][0]<=inter[j][1] ||
                // inter[i][1]>=inter[j][0] && inter[i][1]<=inter[j][1] ||
                // inter[j][0]>=inter[i][0] && inter[j][0]<=inter[i][1]||
                // inter[j][1]>=inter[i][0] && inter[j][1]<=inter[i][1]) cnt++;
                if(Math.max(inter[i][0],inter[j][0])<=Math.min(inter[i][1],inter[j][1]))cnt++;
            }
        }
        return cnt;
    }
}