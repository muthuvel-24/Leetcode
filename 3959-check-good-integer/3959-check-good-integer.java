class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int pro=0;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+rem;
            pro=pro+(rem*rem);
            n=n/10;
        }
        int res=pro-sum;
        return res>=50;
    }
}