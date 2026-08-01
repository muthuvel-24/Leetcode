class Solution {
    public boolean isAcronym(List<String> w, String s) {
        String res="";
        for(int i=0;i<w.size();i++)
        {
            String temp=w.get(i);
            char ch=temp.charAt(0);
            res+=String.valueOf(ch);
        }
        return res.equals(s);
    }
}