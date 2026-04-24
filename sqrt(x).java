class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int l = 1, r = x;
        while (l <= r) {
            int m = l + (r - l) / 2;
            long sq = (long) m * m;
            if (sq == x) return m;
            if (sq < x) l = m + 1;
            else r = m - 1;
        }
        return r; // floor(sqrt(x))
    }
}
