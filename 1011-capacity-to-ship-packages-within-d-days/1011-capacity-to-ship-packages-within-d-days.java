class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int totweg=0,max=weights[0];
        for(int i=0;i<weights.length;i++){
            totweg+=weights[i];
            max=Math.max(weights[i],max);
        }
        while(max<=totweg)
        {
            int mid=max+(totweg-max)/2;
            if(noofdays(weights,days,mid)){
                totweg=mid-1;
            }
            else{
                max=mid+1;
            }
        }
        return max;
    }

    public boolean noofdays(int[] weights,int days,int mid){
        int sum=0,day=1;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]>mid)
            {
                day++;
                sum=weights[i];
            }
            else sum+=weights[i];
        }

        if(day<=days) return true;
        return false;
    }
}