package WEEK2.DAY2;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] letterCount = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            letterCount[s1.charAt(i) - 'a']++;
            letterCount[s2.charAt(i) - 'a']--;
        }

        if (isBalanced(letterCount)) {
            return true;
        }

        for (int right = s1.length(); right < s2.length(); right++) {
            letterCount[s2.charAt(right) - 'a']--;

            int left = right - s1.length();
            letterCount[s2.charAt(left) - 'a']++;

            if (isBalanced(letterCount)) {
                return true;
            }
        }

        return false;
    }

    private boolean isBalanced(int[] letterCount) {
        for (int value : letterCount) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PermutationInString checker = new PermutationInString();

        String small = "ab";
        String big = "eidbaooo";

        System.out.println(checker.checkInclusion(small, big));
    }
}