class Solution {
    public int splitArray(int[] nums, int k) {
        int max=nums[0],sum=0;

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            max=Math.max(max,nums[i]);
        }

        while(max<=sum){
            int mid=max+(sum-max)/2;

            if(findStud(nums,mid)>k) max=mid+1;
            else sum=mid-1;
        }

        return max;
        
    }

    public int findStud(int[] arr,int mid){
        int stud=1,sum=0;

        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=mid) sum+=arr[i];
            else{
                sum=arr[i];
                stud++;
            }
        }
        return stud;
    }
}