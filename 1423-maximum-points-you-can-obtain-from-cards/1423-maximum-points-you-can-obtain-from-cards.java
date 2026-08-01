class Solution {
    public int maxScore(int[] card, int k) {
        int l=0;
        int rs=0;
        for(int i=0;i<k;i++)
        {
            l=l+card[i];
        }
        int max=l;
        int r=card.length-1;
        for(int i=k-1;i>=0;i--)
        {
            l=l-card[i];
            rs=rs+card[r];
            r--;
            max=Math.max(max,l+rs);
        }return max;
    }
}