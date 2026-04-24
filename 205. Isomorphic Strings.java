import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        Set<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            Character prev = map.get(a);
            if (prev != null) {
                if (prev != b) return false;
            } else {
                if (used.contains(b)) return false;
                map.put(a, b);
                used.add(b);
            }
        }
        return true;
    }
}
