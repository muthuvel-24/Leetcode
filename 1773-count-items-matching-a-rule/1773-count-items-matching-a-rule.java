class Solution {
    public int countMatches(List<List<String>> items, String key, String value) {
       String a="type";
       String b="color";
       String c="name";
       int count=0;
        for(int i=0;i<items.size();i++)
        {
            List<String> s=new ArrayList<>();
            s=items.get(i);
            if(key.equals(a))
            {
                    if(s.get(0).equals(value)) count++;
            }
            if(key.equals(b))
            {
                    if(s.get(1).equals(value)) count++;
            }
            if(key.equals(c))
            {
                    if(s.get(2).equals(value)) count++;
            }
        }
        return count;
    }
}