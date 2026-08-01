class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));
        List<Double> list=new ArrayList<>();
        int l=0;int r=nums.length-1;
        while(l<r)
        {
            double temp=(nums[l]+nums[r])/2.0;
            list.add(temp);
            l++;
            r--;
        }
        double min=Double.MAX_VALUE;
        for(double i:list)
        {
            if(min>i) min=i;
        }
        return min;
    }
}