class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        if(map.size()<1) return -1;
        int max=0;
        for(int m:map.values())
        {
            max=Math.max(max,m);
        }
        int ans=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
          if (entry.getValue() == max) {
          ans = entry.getKey();
        break;
        }
}
        return ans;
    }
}