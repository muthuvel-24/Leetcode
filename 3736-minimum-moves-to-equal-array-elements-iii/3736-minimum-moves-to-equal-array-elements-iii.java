class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i:nums)
        {
            max=Math.max(i,max);
        }
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+(max-nums[i]);
        }
        return sum;
    }
}