class Solution {
    public int maximumBags(int[] cap, int[] rock, int ar) {
       int arr[]=new int[cap.length];
       int count=0;
       for(int i=0;i<cap.length;i++)
       {
        arr[i]=cap[i]-rock[i];
       }
       Arrays.sort(arr);
      
       int sum=ar;
       for(int i=0;i<arr.length;i++)
       {
         int temp=sum-arr[i];
         sum=sum-arr[i];
         if(temp>=0) count++;
         else break;
       }
       return count;
    }
}