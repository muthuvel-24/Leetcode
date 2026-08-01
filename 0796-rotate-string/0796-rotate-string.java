class Solution {
    public boolean rotateString(String s, String goal) {
        int k=0;
        boolean muthu=false;
        char a[]=s.toCharArray();
    char b[]=goal.toCharArray();
    while(k<a.length)
    {
        char temp=a[0];
         for(int i=1;i<a.length;i++)
         {
             a[i-1]=a[i];
         }
         a[a.length-1]=temp;
         if(Arrays.equals(a,b)) muthu=true;
         k++;
         
    }
    return muthu;
    }
}