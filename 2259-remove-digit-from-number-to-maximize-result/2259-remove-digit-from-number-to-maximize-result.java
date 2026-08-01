import java.math.BigInteger;
class Solution {
    public String removeDigit(String n, char d) {
        StringBuilder sb=new StringBuilder(n);
        String temp=sb.toString();
        BigInteger res = BigInteger.ZERO;
        int r=0;
        while(r<n.length())
        {
            if(sb.charAt(r)==d)
            {
                sb.deleteCharAt(r);
                BigInteger tem=new BigInteger(sb.toString());
                if(tem.compareTo(res)>0)
                {
                    res=tem;
                }
            }
            r++;
            sb=new StringBuilder(temp);
        }
        return res+"";
    }
}