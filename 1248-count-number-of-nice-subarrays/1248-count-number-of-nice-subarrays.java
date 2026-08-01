class Solution {
    int muthu(int[]nums,int k)
    {
     int res=0;int r=0;int l=0;
       int count=0;
       while(r<nums.length)
       {
         if(nums[r]%2!=0) count++;
         while(count>k)
         {
            if(nums[l]%2!=0) count--;
            l++;
         }
         res+=r-l+1;
         r++;
       }
       //System.out.println(res);
       return res;
    }
    public int numberOfSubarrays(int[] nums, int k) {
      return muthu(nums,k)-muthu(nums,k-1);
    }
}