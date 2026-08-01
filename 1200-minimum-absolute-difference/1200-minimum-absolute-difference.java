class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            int a=arr[i]-arr[i-1];
            min=Math.min(min,a);
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<arr.length;i++)
        {
            List<Integer> list=new ArrayList<>();
            if(arr[i]-arr[i-1]==min)
            {
                list.add(arr[i-1]);
                list.add(arr[i]);
                res.add(list);
            } 
        }return res;
    }
}