class Solution {
    public int countPrimes(int n) 
   {
     int count=0;
     boolean a[]=new boolean[n];
     for(int i=2;i<n;i++)
     {
        a[i]=true;
     }
     for(int i=2;i*i<n;i++)
     {
        for(int j=i*i;j<n;j=j+i)
        {
            a[j]=false;
        }
     }
     for(int i=0;i<n;i++)
     {
        if(a[i]==true) count++;
     }
     return count;
   }
}