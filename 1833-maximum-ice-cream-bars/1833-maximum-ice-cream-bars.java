class Solution {
    public int maxIceCream(int[] cost, int coin) {
        Arrays.sort(cost);
        if(cost[0]>coin) return 0;
        int count=0;
        int r=coin;
        for(int i=0;i<cost.length;i++)
        {
            if(r>=cost[i])
            {
                count++;
                r-=cost[i];
            }
        }
        return count;
    }
}