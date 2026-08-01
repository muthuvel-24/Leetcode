class Solution {
    public int maxProduct(int[] nums) {
      int max=Integer.MIN_VALUE;

      int m1=1;
      for(int i=0;i<nums.length;i++)
      {
        m1*=nums[i];
        max=Math.max(max,m1);
        if(m1==0) m1=1;
      }
      int m2=1;
      for(int i=nums.length-1;i>=0;i--)
      {
        m2*=nums[i];
        max=Math.max(max,m2);
        if(m2==0) m2=1;
      }
      return max;
    }
}