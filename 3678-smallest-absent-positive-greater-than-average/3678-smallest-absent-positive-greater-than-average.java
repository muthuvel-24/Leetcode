class Solution {
    public int smallestAbsent(int[] nums) {
      if(nums.length==1)
      {
        if(nums[0]<1) return 1;
      }
       int sum=0;
       for(int i=0;i<nums.length;i++)
       {
         sum+=nums[i];
       } 
       int val=sum/nums.length;
       System.out.print(val);
       if(val<0) val=0;
       Arrays.sort(nums);
       int k=val+1;
       Set<Integer> set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
       for(int i=0;i<nums.length;i++)
       {
         if((!set.contains(k))&&k>val) return k;
         k++;
       }
       return k;
    }
}