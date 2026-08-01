class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean a=true;
        int temp=original;
        while(a)
        {
            a=false;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==temp)
                {
                    temp=nums[i]*2;
                    a=true;
                    break;
                }
            }
        }
        return temp;
    }
}