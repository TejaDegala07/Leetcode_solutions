
/* a much easier way and tc is also better (https://youtu.be/JXU4Akft7yk?si=BUDsz8wVkbdTCFfc) */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        int l=0,r=m*n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int row=mid/m,col=mid%m;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) l=mid+1;
            else r=mid-1;
        }

       return false;
        
    }
    
}