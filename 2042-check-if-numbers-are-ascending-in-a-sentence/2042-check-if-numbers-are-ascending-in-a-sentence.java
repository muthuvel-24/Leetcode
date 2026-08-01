class Solution {
    public boolean areNumbersAscending(String s) {
        String a[]=s.split("\\s+");
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            String temp=a[i];
            if(Character.isDigit(temp.charAt(0)))
            {
                list.add(Integer.parseInt(temp));
            }
        }
        boolean jeba=true;
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)==list.get(i+1))
            {
                jeba=false;
                break;
            }
        }
        if(jeba)
        {
        List<Integer> res=new ArrayList<>(list);
        Collections.sort(list);
        if(list.equals(res)) return true;
        }
        return false;
    }
}