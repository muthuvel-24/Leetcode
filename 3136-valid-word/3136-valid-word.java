class Solution {
    public boolean isValid(String word) {
      if(word.length()<3) return false;
      word=word.toLowerCase();
      int count=0;
      for(int i=0;i<word.length();i++)
      {
        if("aeiou".indexOf(word.charAt(i))!=-1)
        {
            count++;
            break;
        }
      } 
      for(int i=0;i<word.length();i++)
      {
        if("qwrtypsdfghjklzxcvbnm".indexOf(word.charAt(i))!=-1)
        {
            count++;
            break;
        }
      } 
      if(count!=2) return false;
      for(int i=0;i<word.length();i++)
      {
        if("qwertyuiopasdfghjklzxcvbnm1234567890".indexOf(word.charAt(i))==-1) return false;
      }  
      return true;
    }
}