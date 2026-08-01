class Solution {
    public int maxRepeating(String s, String w) {
        int count=0;
        String jeba=w;
        while(s.contains(w))
        {
             w=w+jeba;
             count++;
        }
        return count;
    }
}