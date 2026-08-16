class Solution {
    public int elevatorRequests(int n, int[] req) {
        int needed=req[0]-0;
        
        for(int i=1;i<req.length;i++){
            needed+=Math.abs(req[i-1]-req[i]);
        }
        return needed;
        
    }
}