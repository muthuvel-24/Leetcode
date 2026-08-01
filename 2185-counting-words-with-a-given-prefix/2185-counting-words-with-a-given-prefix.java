class Solution {
    public int prefixCount(String[] word, String pref) {
        int count=0;
        for(int i=0;i<word.length;i++)
        {
            String temp=word[i];
            if(temp.startsWith(pref)) count++;
        }
        return count;
    }
}