class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String s=String.valueOf(num);
        for(int i=0;i<s.length()-k+1;i++)
        {
            String temp="";
            for(int j=i;j<i+k;j++)
            {
                 temp+=String.valueOf(s.charAt(j));
            }
            int n=Integer.parseInt(temp);
            if(n!=0){
            if(num%n==0) count++;}
        }
        return count;
    }
}