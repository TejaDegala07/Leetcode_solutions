class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] comarr=new int[nums1.length+nums2.length];

        

        for(int i=0;i<nums1.length;i++)
        {
            comarr[i]=nums1[i];
        }

        int j=nums1.length;
        for(int i=0;i<nums2.length;i++)
        {
            comarr[j]=nums2[i];
            j++;
        }
        Arrays.sort(comarr);
        double ans=0;
        int len=comarr.length;
        if(comarr.length==1)
        {
            return comarr[0];
        }

        if(len%2!=0)
        {
            return comarr[len/2];
        }
        else
        {
            ans=(comarr[len/2] + comarr[len/2-1])/2.0;
        }

        return ans;
        
    }
}