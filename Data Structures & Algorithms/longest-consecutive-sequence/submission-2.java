class Solution {
    public int longestConsecutive(int[] nums) {
    if(nums.length == 0){
           return 0;
        }
    Set<Integer> set = new TreeSet<>();
        for(int num : nums){
            set.add(num);
        }
    List<Integer> list = new ArrayList<>(set);

          int currentLength = 1;
          int maxLength = 1;
    for(int i = 1; i < list.size();i++){ 
        if(list.get(i) == list.get(i-1) + 1){
            currentLength++;
            maxLength = Math.max(maxLength,currentLength);
            } else {
                currentLength = 1;
            }
        }   
        return maxLength;
    }
    }

