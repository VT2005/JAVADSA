class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int diff = Math.abs(nums[n - 1] - nums[0]);
        for (int i = 1; i < n; i++) {
            diff = Math.max(diff, Math.abs(nums[i - 1] - nums[i]));
        }
        return diff;
    }
}
