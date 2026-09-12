class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer,Integer> data = new HashMap<>();
    for(int i =0; i < nums.length; i++){
        int check = target - nums[i];
        if(data.containsKey(check)){
            return new int[]{data.get(check),i};
        } 
            data.put(nums[i],i);

    }
    return new int[0]; 
    }
}
