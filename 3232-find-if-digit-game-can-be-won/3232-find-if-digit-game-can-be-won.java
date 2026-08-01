class Solution {
    public boolean canAliceWin(int[] nums) {
        int sin=0;
        int dou=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10) sin+=nums[i];
            else dou+=nums[i];
        }
        // System.out.print(sin);
        // System.out.print(dou);
        return sin!=dou;
    }
}