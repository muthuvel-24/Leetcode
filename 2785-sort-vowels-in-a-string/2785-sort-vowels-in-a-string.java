class Solution {
    public String sortVowels(String s) {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1) str+=String.valueOf(s.charAt(i));
        }
        char a[]=str.toCharArray();
        Arrays.sort(a);
        int ind=0;
        String res="";
        for(int i=0;i<s.length();i++)
        {
            
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1)
            {
                res+=String.valueOf(a[ind++]);
            }
            else
            {
                res+=String.valueOf(s.charAt(i));
            }
        }
        return res;
    }
}