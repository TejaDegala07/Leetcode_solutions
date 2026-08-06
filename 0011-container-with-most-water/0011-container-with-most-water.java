class Solution {
    public int maxArea(int[] height) {
        int ans=0;

        int l=0,r=height.length-1;

        while(l<r)
        {
            int mh=Math.min(height[l],height[r]);
            ans=Math.max(ans,mh*(r-l));
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return ans;
    }
}