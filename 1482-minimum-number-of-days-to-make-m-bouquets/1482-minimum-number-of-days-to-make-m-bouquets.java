class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
        int max =bloomDay[0];
        int min = bloomDay[0];
        for(int i=0;i<bloomDay.length;i++){
            max=Math.max(max,bloomDay[i]);
            min=Math.min(min,bloomDay[i]);
        }
        while(min<=max)
        {
            int mid=min+(max-min)/2;
            if(psbl(bloomDay,mid,m,k))
                max=mid-1;
            else
                min=mid+1;
        }
        return min;
    }
    public boolean psbl(int[] arr,int ds,int m,int k){
        int count=0,bks=0;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] <= ds) {
            count++;
        } else {
            bks += count / k;
            count = 0;
        }
    }
        bks+=(count/k);
        if(bks>=m) return true;

        return false;
}
}