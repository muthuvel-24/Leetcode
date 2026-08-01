class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int ind=0;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                res[ind++]=nums[i];
            }
        }
        //System.out.print(Arrays.toString(nums));
        return res;
    }
}