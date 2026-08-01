class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int max=0;
        int min=0;
        for(int i=0;i<k;i++)
        {
            min=min+nums[i];
        }
        for(int i=nums.length-1;i>=nums.length-k;i--)
        {
            max=max+nums[i];
        }
        // System.out.println(max);
        // System.out.println(min);
        return Math.abs(min-max);
    }
}