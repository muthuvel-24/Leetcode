class Solution {
    public int maxContainers(int n, int w, int max) {
      int deck=n*n;
      int s=deck*w;
      if(s<max) 
      {
        return deck;
      }
      else return max/w;
    }
}