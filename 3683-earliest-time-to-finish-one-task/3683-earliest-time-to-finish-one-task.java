class Solution {
    public int earliestTime(int[][] tasks) {
        int min=1234567;
        int n=tasks.length;
        for(int i=0;i<n;i++)
        {
           min=Math.min(min,tasks[i][0]+tasks[i][1]);
        }
        return min;
    }
}