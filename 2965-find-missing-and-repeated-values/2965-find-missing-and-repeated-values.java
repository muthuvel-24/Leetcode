class Solution {
    public int[] findMissingAndRepeatedValues(int[][] gd) {
        Set<Integer> a=new TreeSet<>();
        int res[]={-1,-1};
        for(int i=0;i<gd.length;i++)
        {
            for(int j=0;j<gd[0].length;j++)
            {
                if(a.contains(gd[i][j])) res[0]=gd[i][j];
                else a.add(gd[i][j]);
            }
        }
        System.out.print(a);
        int k=1;
        for(int i:a)
        {
            if(k!=i)
            {
                res[1]=k;
                return res;
            }
            k++;
        }
        res[1]=k;
        return res;
    }
}