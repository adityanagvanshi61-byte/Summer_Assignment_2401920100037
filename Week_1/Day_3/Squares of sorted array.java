class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        List<Integer> li = new ArrayList<>();
        int left = 0, right = n - 1;

        // Create a temporary array to store results
        int[] temp = new int[n];
        int pos = n - 1; // fill from the end

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                temp[pos] = nums[left] * nums[left];
                left++;
            } else {
                temp[pos] = nums[right] * nums[right];
                right--;
            }
            pos--;
        }

        // Convert array to ArrayList (if you really want to use ArrayList)
        for (int val : temp) {
            li.add(val);
        }

        // Convert back to int[] to return
        int[] result = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            result[i] = li.get(i);
        }

        return result;
    }
}
