import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> used = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String w = words[i];
            String prev = map.get(p);
            if (prev != null) {
                if (!prev.equals(w)) return false;
            } else {
                if (used.contains(w)) return false;
                map.put(p, w);
                used.add(w);
            }
        }
        return true;
    }
}
