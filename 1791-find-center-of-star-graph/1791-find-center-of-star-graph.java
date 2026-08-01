class Solution {
    public int findCenter(int[][] e) {
        for(int k=0;k<e.length;k++)
        {
            int count=0;
            int check=e[0][k];
            for(int i=1;i<e.length;i++)
            {
                for(int j=0;j<e[0].length;j++)
                {
                    if(e[i][j]==check) count++;
                }
            }
            if(count==e.length-1) return check;
        }
        return 0;
    }
}