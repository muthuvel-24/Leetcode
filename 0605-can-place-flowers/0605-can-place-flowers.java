class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int count=0;
        if(f.length==1&&f[0]==0)
        {
            if(n==1||n==0) return true;
            else return false;
        }
        if(f[0]==0&&f[1]==0) f[0]=-1;
        if(f[f.length-1]==0&&f[f.length-2]==0) f[f.length-1]=-1;
        for(int i=1;i<f.length-1;i++)
        {
            if(f[i]==0&&f[i-1]==0&&f[i+1]==0) f[i]=-1;
        }
        System.out.print(Arrays.toString(f));
        for(int i=0;i<f.length;i++)
        {
            if(f[i]==-1) count++;
        }
        return count>=n;
    }
}