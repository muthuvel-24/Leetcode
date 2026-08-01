class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int i=10;
        while(i>0&&n>=i)
        {
           n=n-i;
           i--;
        }
        if((i+1)%2==0) return true;
        return false;
    }
}