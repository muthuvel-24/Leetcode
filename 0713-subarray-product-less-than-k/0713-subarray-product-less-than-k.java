class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int r=0;
        if (k <= 1) return 0;
        int l=0;
        int count=0;
        int sum=1;
        while(r<nums.length)
        {
            sum=sum*nums[r];
            while(sum>=k)
            {
                sum=sum/nums[l];
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
}