class Solution {
    public String removeOccurrences(String s, String p) {
       while(s.contains(p))
       {
        s=s.replaceFirst(p,"");
       } 
       return s;
    }
}