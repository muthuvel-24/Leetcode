class Solution {
    public String stringHash(String s, int k) {
      String res="";
      String arr[]=new String[s.length()/k];
      int l=0;
      char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      for(int i=0;i<s.length()-k+1;i=i+k)
      {
        arr[l++]=s.substring(i,i+k);
      }
      //System.out.print(Arrays.toString(arr));
    //   return res;
    for(int i=0;i<arr.length;i++)
    {
        String temp=arr[i];
        int a=0;
        for(int j=0;j<temp.length();j++)
        {
            a+=temp.charAt(j)-'a';
        }
        int t=a%26;
        char g=ch[t];
        res+=String.valueOf(g);
    }  
    return res;
    }
}