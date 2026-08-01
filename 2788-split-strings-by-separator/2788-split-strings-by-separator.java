class Solution {
    public List<String> splitWordsBySeparator(List<String> w, char sep) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<w.size();i++)
        {String[] str = w.get(i).split(java.util.regex.Pattern.quote(String.valueOf(sep)));
           for (String st : str) {
    if (!st.isEmpty()) {
        list.add(st);
    }
}
            System.out.print(Arrays.toString(str));
        }
        return list;
    }
}