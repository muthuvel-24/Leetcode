class Solution {
    public String licenseKeyFormatting(String s, int k) {
      StringBuilder a=new StringBuilder();
      for(char i:s.toCharArray())
      {
        if(i!='-') a.append(Character.toUpperCase(i));
      }  
      if(a.length()==1) return s.toUpperCase();
      if(a.length()==0) return "";
    StringBuilder res=new StringBuilder();
    int c=0;
    int h=a.length()%k;
    for(int i=0;i<h;i++)
    {
        res.append(a.charAt(i));
    }
    if(h!=0)res.append('-');
    for(int i=h;i<a.length();i++)
    {
        if(c==k)
        {
            res.append('-');
            c=0;
        }
        res.append(a.charAt(i));
        c++;
    }
    return res.toString();
    }
}