class Solution {

    public String encode(List<String> strs) {
        // Chuyển từ list sang string 
        String s = "";
        for(int i =0; i < strs.size();i++){
             s = s + strs.get(i).length()+"#"+strs.get(i);
        }
        return s;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        //5#helllo5#world
        int i = 0;
        while(i < str.length()){ 
            int j = i;
        while(str.charAt(j) != '#'){
            j++;
        }
           int len = Integer.parseInt(str.substring(i,j));
           String word = str.substring(j+1,j+1+len);
           list.add(word);
            i = j + 1 +len;
        }
            return list;
        }
}