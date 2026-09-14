class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26]; 
        // for(int i = 0; i < str.length();i++){
            // char[] chars = str.toCharArray();
            for(char chars : str.toCharArray()){
            // count[chars[i] - 'a']++;
            count[chars - 'a']++;
        }
        String key = Arrays.toString(count);
        if(!map.containsKey(key)){
            map.put(key, new ArrayList());
        }
        map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
