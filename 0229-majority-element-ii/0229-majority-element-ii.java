class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
       int n=nums.length/3;
       for(int i:map.keySet())
       {
        if(map.get(i)>n)  list.add(i);
       }
       return list;
    }
}