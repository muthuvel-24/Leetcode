class Solution {
    public boolean isSameAfterReversals(int num) {
        String str=num+"";
        StringBuilder sb=new StringBuilder(str);
        sb=sb.reverse();
        int sum=0;
        for(int i=0;i<sb.length();i++)
        {
            sum=(sum*10)+sb.charAt(i)-'0';
        }
        int res=0;
        while(sum>0)
        {
            int rem=sum%10;
            res=(res*10)+rem;
            sum=sum/10;
        }
        return num==res;
    }
}