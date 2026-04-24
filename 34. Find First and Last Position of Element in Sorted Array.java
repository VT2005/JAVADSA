class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = lowerBound(nums, target);
        int right = upperBound(nums, target) - 1;
        if (left <= right) return new int[] { left, right };
        return new int[] { -1, -1 };
    }

    private int lowerBound(int[] nums, int target) {
        int l = 0, r = nums.length; // [l, r)
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < target) l = m + 1;
            else r = m;
        }
        return l;
    }

    private int upperBound(int[] nums, int target) {
        int l = 0, r = nums.length; // first index with nums[i] > target
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] <= target) l = m + 1;
            else r = m;
        }
        return l;
    }
}
