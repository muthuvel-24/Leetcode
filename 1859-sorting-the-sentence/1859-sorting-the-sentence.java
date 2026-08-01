class Solution {
    public String sortSentence(String s) {
        String str[]=s.split("\\s+");
        StringBuilder res=new StringBuilder();
        String temp[]=new String[str.length];
        for(int i=0;i<str.length;i++)
        {
            String a=str[i];
            int ind=a.charAt(a.length()-1)-'0';
            temp[ind-1]=str[i];
        }
        //System.out.print(Arrays.toString(temp));
        for(int i=0;i<temp.length;i++)
        {
            String t=temp[i];
            res.append(t.substring(0,t.length()-1));
            res.append(" ");
        }
        return res.toString().trim();
    }
}