class Solution {
    public String trimTrailingVowels(String s) {
       int i=s.length()-1;
       StringBuilder sb=new StringBuilder(s);
       while(i>=0&&("aeiouAEIOU".indexOf(sb.charAt(i))!=-1))
       {
        sb.deleteCharAt(i);
        i--;
       }
       return sb.toString();
    }
}