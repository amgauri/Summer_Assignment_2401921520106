package WEEK2.DAY2;
import java.util.*;
    
public class FindAllAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> positions = new ArrayList<>();

        if (p.length() > s.length()) {
            return positions;
        }

        int[] countBox = new int[26];

        for (int i = 0; i < p.length(); i++) {
            countBox[p.charAt(i) - 'a']++;
            countBox[s.charAt(i) - 'a']--;
        }

        if (isEmpty(countBox)) {
            positions.add(0);
        }

        for (int right = p.length(); right < s.length(); right++) {
            countBox[s.charAt(right) - 'a']--;

            int left = right - p.length();
            countBox[s.charAt(left) - 'a']++;

            if (isEmpty(countBox)) {
                positions.add(left + 1);
            }
        }

        return positions;
    }

    private boolean isEmpty(int[] countBox) {
        for (int num : countBox) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        FindAllAnagrams finder = new FindAllAnagrams();

        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(finder.findAnagrams(s, p));
    }
}

