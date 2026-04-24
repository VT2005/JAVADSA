class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int start = -1;
        int lastMin = -1;
        int lastMax = -1;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (x < minK || x > maxK) {
                start = i;
            }
            if (x == minK) lastMin = i;
            if (x == maxK) lastMax = i;

            int bound = Math.min(lastMin, lastMax);
            if (bound > start) count += (bound - start);
        }
        return count;
    }
}
