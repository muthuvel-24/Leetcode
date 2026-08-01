class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       Map<String,Integer> map=new HashMap<>();
       String a[]=s1.split("\\s+");
       String b[]=s2.split("\\s+");
       for(String st:a)
       {
        map.put(st,map.getOrDefault(st,0)+1);
       }
       for(String st:b)
       {
        map.put(st,map.getOrDefault(st,0)+1);
       }
       List<String> list=new ArrayList<>();
       for(String i:map.keySet())
       {
        if(map.get(i)==1) list.add(i);
       }
      String ans[]= new String[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}