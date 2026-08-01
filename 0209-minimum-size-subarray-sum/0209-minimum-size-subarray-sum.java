class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int res=Integer.MAX_VALUE;
      int sum1=0;
      for(int i=0;i<nums.length;i++)
      {
        sum1+=nums[i];
      }
      if(sum1==target) return nums.length;
      if(sum1<target) return 0;
      int left=0;
      int right=0;
      int sum=0;
      while(right<nums.length)
      {
        int count=0;
         sum=sum+nums[right];
         while(sum>=target)
         {
            count=right-left+1;
            res=Math.min(count,res);
            sum=sum-nums[left];
            left++;
         }
         right++;
      }
      return res;
    }
}