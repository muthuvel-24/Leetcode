class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<score.length;i++)
        {
            list.add(score[i][k]);
        }
        Collections.sort(list);
        Collections.reverse(list);
        int h=0;
       int arr[][]=new int[score.length][score[0].length];
       for(int li:list)
       {
        for(int i=0;i<score.length;i++)
        {
            if(score[i][k]==li)
            {
               for(int j=0;j<score[0].length;j++)
               {
                 arr[h][j]=score[i][j];
               }
               h++;
            }
        }
       }
       return arr;
    }
}