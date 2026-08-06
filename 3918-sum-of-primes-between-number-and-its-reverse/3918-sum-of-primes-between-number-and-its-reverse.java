class Solution {
    public int sumOfPrimesInRange(int n) {
        int sum=0;
        String s=String.valueOf(n);
        int l=0;
        int r=s.length()-1;
        char a[]=s.toCharArray();
        while(l<r)
        {
            char temp=a[r];
            a[r]=a[l];
            a[l]=temp;
            l++;
            r--;
        }
     int tem=Integer.parseInt(String.valueOf(a));
        int fir=Math.min(n,tem);
        int las=Math.max(n,tem);
        for(int i=fir;i<=las;i++)
        {
            boolean muthu=true;
            if(i<2) continue;
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0){
                    muthu=false;
                    break;
                }
            }
            if(muthu) sum+=i;
        }
        return sum;
    }
}