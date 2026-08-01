class Solution {
    public String removeTrailingZeros(String num) {
     int k=num.length()-1;
     while(num.charAt(k)=='0')
     {
        k--;
     }
     return num.substring(0,k+1);
    }
}