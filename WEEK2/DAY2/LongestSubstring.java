package WEEK2.DAY2;

import java.util.*;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();

        int start = 0;
        int bestLength = 0;

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);

            // Remove characters until duplicate is gone
            while (seen.contains(current)) {
                seen.remove(s.charAt(start));
                start++;
            }

            seen.add(current);

            int windowSize = end - start + 1;
            bestLength = Math.max(bestLength, windowSize);
        }

        return bestLength;
    }

    public static void main(String[] args) {
        LongestSubstring solver = new LongestSubstring();

        String text = "abcabcbb";
        System.out.println(solver.lengthOfLongestSubstring(text));
    }
}

