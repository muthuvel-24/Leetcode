class Solution {
    public int compress(char[] chars) {
        String a="";
        int i=0;
        while(i<chars.length) {
            char ch=chars[i];
            int count=0;
            while(i<chars.length&&chars[i]==ch) {
                count++;
                i++;
            }
            a += ch;
            if(count>1)
                a+=count;
        }
        for(int k=0;k<a.length();k++)
        {
            chars[k]=a.charAt(k);
        }
        return a.length();
    }
}