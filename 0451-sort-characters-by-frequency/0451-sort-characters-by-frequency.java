class Solution {
    public String frequencySort(String s) {
       Map<Character,Integer> map=new HashMap<>();
       String res="";
       Set<Character> set=new HashSet<>();
       for(char ch:s.toCharArray())
       {
        map.put(ch,map.getOrDefault(ch,0)+1);
        set.add(ch);
       } 
        List<Integer> list=new ArrayList<>();
        for(int i:map.values())
        {
            list.add(i);
        }
        Collections.sort(list);
        Collections.reverse(list);
        for(int i=0;i<list.size();i++)
        {
            int temp=list.get(i);
            for(char ch:map.keySet())
            {
                if(map.get(ch)==temp && set.contains(ch))
                {
                    for(int j=0;j<temp;j++)
                    {
                        res+=ch;
                    }
                    set.remove(ch);
                }
            }
        }
        return res;
    }
}