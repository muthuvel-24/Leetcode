class Solution {
    public int passwordStrength(String s) {
        Set<Character> set=new HashSet<>();
        int res=0;
        for(char ch:s.toCharArray())
        {
            set.add(ch);
        }
        List<Character> list=new ArrayList<>(set);
        for(char ch:list)
        {
            if(Character.isUpperCase(ch)) res+=2;
            if(Character.isLowerCase(ch)) res+=1;
            if(Character.isDigit(ch)) res+=3;
            if(!Character.isLetterOrDigit(ch)) res+=5;
        }
        return res;
    }
}