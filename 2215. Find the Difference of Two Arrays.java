import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        for (int x : nums1) a.add(x);
        for (int x : nums2) b.add(x);

        List<Integer> onlyA = new ArrayList<>();
        for (int x : a) if (!b.contains(x)) onlyA.add(x);

        List<Integer> onlyB = new ArrayList<>();
        for (int x : b) if (!a.contains(x)) onlyB.add(x);

        List<List<Integer>> res = new ArrayList<>();
        res.add(onlyA);
        res.add(onlyB);
        return res;
    }
}
