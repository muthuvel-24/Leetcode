class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum =0,rightSum =0,diff=0;
        for(int i=0;i<nums.length;i++)
        {
            rightSum+=nums[i];
        }
        leftSum=0;
       // int totalSum = leftSum+rightSum;
        for(int i=0;i<nums.length;i++)
        {
            rightSum-=nums[i];
            diff = Math.abs(rightSum-leftSum);
            leftSum+=nums[i];
            nums[i] = diff;
        }
        return nums;
    }
}