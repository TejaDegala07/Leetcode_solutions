
/* a much easier way and tc is also better (https://youtu.be/JXU4Akft7yk?si=BUDsz8wVkbdTCFfc) */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            if(matrix[i][0]<=target  && matrix[i][m-1]>=target)
            {
                int l=0,r=m-1;
                while(l<=r)
                {
                    int mid=l+(r-l)/2;
                    if(matrix[i][mid]==target)
                    {
                        return true;
                    }
                    else if(target <matrix[i][mid])
                    {
                        r=mid-1;
                    }
                    else
                    {
                        l=mid+1;
                    }
                }
            }
        }
        return false;

       
        
    }
    
}