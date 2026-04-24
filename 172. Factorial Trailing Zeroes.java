class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        for (long x = 5; x <= n; x *= 5) {
            res += n / x;
        }
        return res;
    }
}
