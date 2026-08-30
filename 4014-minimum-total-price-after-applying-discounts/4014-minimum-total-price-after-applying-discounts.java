class Solution {
    public double minPrice(int[] p, int[] d) {
       double res=0;
       Arrays.sort(p);
       Arrays.sort(d);
       int l=0;
       int r=p.length-1;
       while(l<r)
       {
        int temp=p[l];
        p[l]=p[r];
        p[r]=temp;
        l++;
        r--;
       } 
        l=0;
       r=d.length-1;
       while(l<r)
       {
        int temp=d[l];
        d[l]=d[r];
        d[r]=temp;
        l++;
        r--;
       }
       int n=Math.min(p.length,d.length);
       for(int i=0;i<n;i++)
       {
         double temp=p[i]*(100-d[i])/100.0;
         res=res+temp;
       }
       if(n==p.length) return res;
       else
       {
         for(int i=n;i<p.length;i++)
         {
            res+=p[i];
         }
       }
       return res;
    }
}