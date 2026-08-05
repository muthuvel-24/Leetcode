class Solution {
    public String longestPalindrome(String s) {
        String max="";
       int k=0;
       while(k<s.length())
       {
        for(int i=k+1;i<=s.length();i++)
        {
            String b=s.substring(k,i);
            if(muthu(b))
            {
                int strlen=max.length();
                int blen=b.length();
                if(blen>strlen) max=b;
            }
        }
        k++;
       } 
       return max;
    }
    public static boolean muthu(String s)
    {
       int i=0;
       int j=s.length()-1;
       while(i<j)
       {
         if(s.charAt(i)!=s.charAt(j)) return false;
         i++;
         j--;
       }
       return true;
    }
}