class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
       
    for(int i = 0; i < numbers.length;i++){
        int check = target - numbers[i];
        if(map.containsKey(check)){
            return new int[] {map.get(check)+1,i+1};
        }
        map.put(numbers[i],i);
    }
    return new int[]{};
        }
}
