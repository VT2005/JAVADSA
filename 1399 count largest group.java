import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> freq = new HashMap<>();
        int best = 0;
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            int c = freq.getOrDefault(sum, 0) + 1;
            freq.put(sum, c);
            if (c > best) best = c;
        }

        int res = 0;
        for (int c : freq.values()) {
            if (c == best) res++;
        }
        return res;
    }

    private int digitSum(int x) {
        int s = 0;
        while (x > 0) {
            s += x % 10;
            x /= 10;
        }
        return s;
    }
}
