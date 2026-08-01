class Solution {
    public boolean areOccurrencesEqual(String s) {
      int freq[]=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int num = freq[s.charAt(0)-'a'];
        for(char ch : s.toCharArray()){
            if(freq[ch-'a']!=num){
                return false;
            }
        }
        return true;
    }
}