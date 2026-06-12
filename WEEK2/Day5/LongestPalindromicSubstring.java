package WEEK2.Day5;


public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int bestStart = 0;
        int bestEnd = 0;

        for (int middle = 0; middle < s.length(); middle++) {
            // odd length palindrome, like racecar
            int oddSize = expandFromMiddle(s, middle, middle);

            // even length palindrome, like abba
            int evenSize = expandFromMiddle(s, middle, middle + 1);

            int betterSize = Math.max(oddSize, evenSize);

            if (betterSize > bestEnd - bestStart + 1) {
                bestStart = middle - (betterSize - 1) / 2;
                bestEnd = middle + betterSize / 2;
            }
        }

        return s.substring(bestStart, bestEnd + 1);
    }

    private int expandFromMiddle(String s, int left, int right) {
        // dono side me same char milte rahe to expand karte jao
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring task = new LongestPalindromicSubstring();

        String text = "babad";

        System.out.println(task.longestPalindrome(text));
    }
}