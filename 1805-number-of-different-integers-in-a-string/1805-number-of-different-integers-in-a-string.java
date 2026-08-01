class Solution {
    public int numDifferentIntegers(String w) {
     w+='a';
     Set<String> set=new LinkedHashSet<>();
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<w.length();i++)
     {
       char ch=w.charAt(i);
       if(Character.isDigit(ch))
       {
        sb.append(ch);
       }
       else{
        if(sb.length()!=0)
        {
            int j=0;
            while(j<sb.length()-1&&sb.charAt(j)=='0') j++;
            set.add(sb.substring(j));
            sb=new StringBuilder();
        }
       }
     }
     return set.size();
    }
}