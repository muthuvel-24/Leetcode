class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        Map<Integer,String> map=new HashMap<>();
        for(int i=0;i<n.length;i++)
        {
            map.put(h[i],n[i]);
        }
        String ans[]=new String[n.length];
        Arrays.sort(h);
        int k=0;
        for(int i=h.length-1;i>=0;i--)
        {
            ans[k++]=map.get(h[i]);
        }
        // System.out.print(Arrays.toString(ans));
        return ans;
    }
}