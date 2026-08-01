class Solution {
    public static int minval(int nums[])
    {
        int min1=Integer.MAX_VALUE;
        for(int f:nums)
        {
            min1=Math.min(min1,f);
        }
        return min1;
    }
    public int[] getFinalState(int[] nums, int k, int m) {
        int i=0;
        while(i<k)
        {
            int min =minval(nums);
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==min)
                {
                    nums[j]=nums[j]*m;
                    break;
                }
            }
            i++;
        }
        return nums;
    }
}