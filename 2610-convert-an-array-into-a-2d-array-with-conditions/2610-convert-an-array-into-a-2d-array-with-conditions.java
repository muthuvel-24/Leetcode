class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        for(int i:nums)
        {
            list.add(i);
        }
        while(list.size()>0)
        {
            List<Integer> temp=new ArrayList<>();
            int r=0;
            while(r<list.size())
            {
                if(!temp.contains(list.get(r)))
                {
                   temp.add(list.get(r));
                   list.remove(r);
                }
                else{
                r++;
                }
            }
            res.add(temp);
        }
        return res;
    }
}