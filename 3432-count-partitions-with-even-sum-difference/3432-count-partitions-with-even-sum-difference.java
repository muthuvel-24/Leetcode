class Solution {
    public int countPartitions(int[] nums) {
        int sum=nums[0];
        int sum1=0;
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            sum1+=nums[i];
        }
        int left=1;
        while(left<nums.length)
        {
            int temp=sum-sum1;
            if(temp%2==0) count++;
            sum=sum+nums[left];
            sum1=sum1-nums[left];
            left++;
        }
        return count;
    }
}