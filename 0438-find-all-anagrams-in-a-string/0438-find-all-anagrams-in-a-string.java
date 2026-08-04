class Solution {
    boolean muthu(String temp,char[] ch2)
    {
        char ch1[]=temp.toCharArray();
        Arrays.sort(ch1);
        return Arrays.equals(ch1,ch2);
    }
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> list=new ArrayList<>();
       int n=p.length();
       char ch2[]=p.toCharArray();
       Arrays.sort(ch2);
       for(int i=0;i<=s.length()-n;i++)
       {
         String temp=s.substring(i,i+n);
         if(muthu(temp,ch2)) list.add(i);
       } 
       return list;
    }
}