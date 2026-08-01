class Solution {
    public int largestAltitude(int[] gain) {
        // int res[]=new int[gain.length+1];
        // res[0]=0;
        int sum=0;
        // int ind=1;
        int max=0;
        for(int i=0;i<gain.length;i++)
        {
            sum+=gain[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}