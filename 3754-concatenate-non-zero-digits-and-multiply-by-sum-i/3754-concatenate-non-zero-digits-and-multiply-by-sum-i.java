class Solution {
    public long sumAndMultiply(int n) {
       int sum=0;
       int temp=n;
       while(temp>0)
       {
         int rem=temp%10;
         if(rem!=0) sum=sum*10+rem;
         temp=temp/10;
       }
       int ans=sum;
       long res=0;
       while(ans>0)
       {
        int rem=ans%10;
        res=res*10+rem;
        ans=ans/10;
       }
       int sum1=0;
       while(sum>0)
       {
        int rem=sum%10;
        sum1=sum1+rem;
        sum=sum/10;
       }
    //    System.out.println(ans);
    //    System.out.println(sum1);
       return res*sum1;
    }
}