class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length() ){
        return false;
       }

      Map<Character,Integer> isAnagram = new HashMap<Character,Integer>();

      Map<Character,Integer> isAnagram1 = new HashMap<Character,Integer>();

        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            isAnagram.put(s.charAt(i),isAnagram.getOrDefault(c,0) +1);
          
        }

        for(int i = 0; i < t.length();i++){
            char d = t.charAt(i);
            isAnagram1.put(d,isAnagram1.getOrDefault(d,0) +1);
        }
        
        return isAnagram.equals(isAnagram1);
    }
}
