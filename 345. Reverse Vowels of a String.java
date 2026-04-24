import java.util.HashSet;
import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;
        Set<Character> vowels = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) vowels.add(c);

        while (i < j) {
            while (i < j && !vowels.contains(a[i])) i++;
            while (i < j && !vowels.contains(a[j])) j--;
            if (i < j) {
                char tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
            }
        }
        return new String(a);
    }
}
