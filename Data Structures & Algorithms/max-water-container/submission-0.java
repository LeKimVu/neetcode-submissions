class Solution {
    public int maxArea(int[] heights) {
        int r = heights.length - 1;
        int l = 0;
        int maxS = 0;
        while(l < r) {
            int height = Math.min(heights[l],heights[r]);
            int width = r - l;
            int s = height * width;
            maxS = Math.max(maxS,s);
        if(heights[l] < heights[r]) {
            l++;
        }else { 
            r--;
        }
        }
        return maxS; 
    }
}
