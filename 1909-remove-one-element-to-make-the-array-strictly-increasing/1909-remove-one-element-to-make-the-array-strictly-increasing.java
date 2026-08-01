class Solution {
    public boolean canBeIncreasing(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i:nums)
        {
            list.add(i);
        }
        List<Integer>temp=new ArrayList<>();
        temp.addAll(list);
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<temp.size();i++)
        {
            temp.remove(i);
            a.addAll(temp);
            boolean m=true;
            for(int j=0;j<a.size()-1;j++)
            {
                if(a.get(j)>=a.get(j+1)) m=false;
            }
            if(m) return true;
            temp.clear();
            temp.addAll(list);
            a.clear();
        }
        return false;
    }
}