class Solution {
    public String mostCommonWord(String p, String[] b) {
        p=p.toLowerCase();
        p=p.replaceAll("[!?',;.]"," ");
        for(int i=0;i<b.length;i++)
        {
             String temp=b[i].toLowerCase();
            p=p.replaceAll(temp,"");
        }
        Map<String,Integer>map=new HashMap<>();
        String arr[]=p.split("\\s+");
         //System.out.print(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
           if(!arr[i].isEmpty()) map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=0;
        for(int i:map.values())
        {
            max=Math.max(max,i);
        }
        String res="";
        for(String str:map.keySet())
        {
            if(map.get(str)==max)
            {
                res=str;
                break;
            }
        }
        return res;
    }
}