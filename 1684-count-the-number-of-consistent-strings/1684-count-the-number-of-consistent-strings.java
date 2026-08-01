class Solution {
    public int countConsistentStrings(String all, String[] w) {
       int count=0;
       for(int i=0;i<w.length;i++)
       {
        String temp=w[i];
        boolean thousif=true;
        for(int j=0;j<temp.length();j++)
        {
            if(!all.contains(String.valueOf(temp.charAt(j)))) thousif=false;
        }
        if(thousif) count++;
       } return count;
    }
}