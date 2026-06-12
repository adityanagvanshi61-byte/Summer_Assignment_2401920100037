class Solution {
    public int maxArea(int[] height) {
        int left=0,lower, max_wat=0;
        int right = height.length-1;
        while (left<right){
            int width=right-left;
            lower = Math.min(height[left],height[right]);
            max_wat=Math.max(max_wat,(lower*width));

            if(lower==height[left]) left++;
            else right--;
        }
        return max_wat;
        
    }
}
