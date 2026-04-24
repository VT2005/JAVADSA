import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            int need = target - v;
            Integer j = indexByValue.get(need);
            if (j != null) {
                return new int[] { j, i };
            }
            indexByValue.put(v, i);
        }
        return new int[] {};
    }
}
