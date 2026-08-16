class Solution {
    public int elevatorRequests(int n, int[] req) {
        int needed=0;
        needed+=req[0]-0;
        for(int i=1;i<req.length;i++){
            int j=i-1;
            needed+=Math.abs(req[j]-req[i]);
        }
        return needed;
        
    }
}