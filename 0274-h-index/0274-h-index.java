class Solution {
    public int hIndex(int[] c) {
        Arrays.sort(c);
        int res=0;
        int h=c.length;
        for(int i=0;i<c.length;i++)
        {
            int count=h-i;
            if(c[i]>=count)
            {
                res=Math.max(res,count);
                return res;
            }
        }
        return res;
    }
}