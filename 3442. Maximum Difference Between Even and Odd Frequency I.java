import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for (int v : freq.values()) {
            if ((v & 1) == 1) maxOdd = Math.max(maxOdd, v);
            else minEven = Math.min(minEven, v);
        }
        return maxOdd - minEven;
    }
}
