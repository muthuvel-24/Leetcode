class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int freq[]=new int[101];
        for(int i:nums)
        {
            freq[i]++;
        }
        int prod=0;
        for(int i=0;i<101;i++)
        {
            if(freq[i]!=0&&freq[i]%k==0)
            {
                prod=prod+freq[i]*i;
            }
        }
        return prod;
    }
}