class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int max=1;
        Set<Integer> set=new TreeSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        int arr[]=new int[set.size()];
        int ind=0;
        for(int i:set)
        {
            arr[ind++]=i;
        }
        int count=1;
        for(int i=0;i<arr.length-1;i++)
        {
              if(arr[i]+1==arr[i+1]) count++;
              else count=1;
              max=Math.max(max,count);
        }
        return max;
    }
}