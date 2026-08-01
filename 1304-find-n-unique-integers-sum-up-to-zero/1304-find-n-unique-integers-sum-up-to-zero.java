class Solution {
    public int[] sumZero(int n) {
       int arr[]=new int[n];
       int k=n/2;
       int s=k*-1;
       int ind=0;
       if(n%2==0) arr[0]=0;
       if(n%2!=0)
       {
        for(int i=s;i<=k;i++)
       {
        arr[ind++]=i;
       } 
       }
       else
       {
         for(int i=s;i<=k;i++)
       {
        if(i==0) continue;
        arr[ind++]=i;
       } 
       }
       return arr;
    }
}