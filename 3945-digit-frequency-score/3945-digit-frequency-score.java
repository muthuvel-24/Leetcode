class Solution {
    public int digitFrequencyScore(int n) {
        String a="";
        while(n!=0)
        {
            int b=n%10;
            a=a+String.valueOf(b);
            n=n/10;
        }
        int sum=0;
        for(int i=0;i<a.length();i++)
        {
            sum+=(a.charAt(i)-'0');
        }
        return sum;
    }
}