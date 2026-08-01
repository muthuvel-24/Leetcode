class Solution {
    public int minBitFlips(int start, int goal) {
       String a=Integer.toBinaryString(start);
       String b=Integer.toBinaryString(goal);
       int count=0;
       char arr[]=a.toCharArray();
       char arr1[]=b.toCharArray();
       int j=arr.length-1;
       int i=arr1.length-1;
       while(i>=0&&j>=0)
       {
        if(arr[j]!=arr1[i])
        {
            count++;
        }
        i--;
        j--;
       }
       while (j>=0) {
            if(arr[j]=='1') count++;
            j--;
        }
        while(i>=0) {
            if(arr1[i]=='1') count++;
            i--;
        }
       return count;
    }
}