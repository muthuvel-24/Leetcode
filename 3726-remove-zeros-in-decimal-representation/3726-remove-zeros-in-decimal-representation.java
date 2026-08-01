class Solution {
    public long removeZeros(long n) {
      long res=0;
      while(n>0)
      {
        long rem=n%10;
        if(rem!=0)
        {
            res=res*10+rem;
        }
        n=n/10;
      } 
      long k=0;
      while(res>0)
      {
        long temp=res%10;
        k=k*10+temp;
        res=res/10;
      }
      return k;
    }
}