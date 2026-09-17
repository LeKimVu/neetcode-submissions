class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;

        // ben trai 
        for(int i = 1; i < nums.length; i++ ){
            res[i] = res[i-1] * nums[i-1];
        }
        // ben phai 
        int posFix = 1; 
        for (int i = res.length -1; i >=0; i--) { 
            res[i] = res[i] * posFix;
            posFix *= nums[i];
        }

        return res;
    }
}  
