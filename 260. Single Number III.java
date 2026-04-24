class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int x : nums) xor ^= x;

        int diffBit = xor & -xor; // rightmost set bit
        int a = 0, b = 0;
        for (int x : nums) {
            if ((x & diffBit) == 0) a ^= x;
            else b ^= x;
        }
        return new int[] { a, b };
    }
}
