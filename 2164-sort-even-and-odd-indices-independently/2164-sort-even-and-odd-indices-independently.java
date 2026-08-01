class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
         int l=0;
        int l1=0;
        if(n%2!=0) l1=(n/2)+1;
        else l1=n/2;
        l=n/2;
        int odd[]=new int[l];
        int even[]=new int[l1];
        int k=0;
        for(int i=0;i<n;i=i+2)
        {
            even[k++]=nums[i];
        }
        k=0;
        for(int i=1;i<n;i=i+2)
        {
            odd[k++]=nums[i];
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int left=0;
        int right=odd.length-1;
        while(left<right)
        {
            int temp=odd[left];
            odd[left]=odd[right];
            odd[right]=temp;
            left++;
            right--;
        }
        // System.out.print(Arrays.toString(odd));
        // System.out.print(Arrays.toString(even));
        int res[]=new int[n];
        int z=0;
        for(int i=0;i<l1;i++)
        {
            res[z]=even[i];
            z=z+2;
        }
        z=1;
        for(int i=0;i<l;i++)
        {
            res[z]=odd[i];
            z+=2;
        }return res;
    }
}