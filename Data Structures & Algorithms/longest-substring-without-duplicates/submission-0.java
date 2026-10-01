class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }
        int left = 0;
        int right = 0;
        int max = 0;
        int currentLength = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()) {
         if(!set.contains(s.charAt((right)))){
            set.add(s.charAt(right));
            currentLength = right - left + 1;
            right++;
          } else {
            set.remove(s.charAt(left));
            left++;
          }
          if(max < currentLength) {
            max = currentLength;
          }

        }
        return max;
        }
}
