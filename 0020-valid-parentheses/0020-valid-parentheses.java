class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray())
        {
            if(i=='('||i=='{'||i=='[') st.push(i);
            else{
                if (st.isEmpty()) return false;
                char c=st.pop();
                if(c=='['&&i!=']') return false;
                if(c=='('&&i!=')') return false; 
                if(c=='{'&&i!='}') return false; 
            }
        }
        return st.isEmpty();
    }
}