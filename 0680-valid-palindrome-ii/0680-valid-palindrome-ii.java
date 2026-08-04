class Solution {
    boolean muthu(StringBuilder temp)
    {
        String k=temp.toString();
        String s = k;
        int l=0;int r=k.length()-1;
        while(l<r)
        {
           if(k.charAt(l)!=k.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }
    
    public boolean validPalindrome(String s) {
        StringBuilder sb=new StringBuilder(s);
        int l=0;int r=sb.length()-1;
        while(l<r)
        {
            if(sb.charAt(l)!=sb.charAt(r))
            {
                boolean a=muthu(new StringBuilder(sb).deleteCharAt(l));
                boolean b=muthu(new StringBuilder(sb).deleteCharAt(r));
                return a || b;
            }
            l++;r--;
        }
        return true;
    }
}