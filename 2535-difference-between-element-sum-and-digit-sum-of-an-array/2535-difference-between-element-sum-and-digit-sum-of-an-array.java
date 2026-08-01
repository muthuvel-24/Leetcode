class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }
        int diff=0;
        for(int i=0;i<n;i++)
        {
            int a=nums[i];
            while(a!=0)
            {
                int rem=a%10;
                diff+=rem;
                a=a/10;
            }
        }
        return Math.abs(sum-diff);
    }
}