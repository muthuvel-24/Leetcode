class Solution {
    public boolean hasMatch(String s, String p) {
        String t[]=p.split("\\*");
        int b=0;
       for(String str:t)
       {
           int ind=s.indexOf(str,b);
           if(ind==-1) return false;
           b=ind+str.length();
       }
       return true;
    }
}