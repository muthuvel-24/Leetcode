class Solution {
    public static boolean sym(int n)
    {
        String str=String.valueOf(n);
        if(str.length()%2!=0) return false;
        else{
            String sub1=str.substring(0,str.length()/2);
            String sub2=str.substring(str.length()/2);
            int sum1=0;int sum2=0;
            for(int i=0;i<sub1.length();i++)
            {
                sum1=sum1+sub1.charAt(i)-'0';
                sum2=sum2+sub2.charAt(i)-'0';
            }
            if(sum1==sum2) return true;
        }
        return false;
    }
    
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++)
        {
            if(sym(i)) count++;
        }
        return count;
    }
}