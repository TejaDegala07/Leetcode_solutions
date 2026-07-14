class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
    int idx=0,mcnt=0;
    for(int i=0;i<arr.length;i++) {
        int l=0;

        for(int j=0;j<arr[i].length;j++) {
            if(arr[i][j]==1)l++;
        }

        if (l > mcnt) {
            mcnt = l;
            idx = i;
        }
}
return new int[]{idx,mcnt};
        
    }
}

