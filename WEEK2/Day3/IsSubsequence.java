 package WEEK2.Day3;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        int firstPointer = 0;
        int secondPointer = 0;

        while (firstPointer < s.length() && secondPointer < t.length()) {

            if (s.charAt(firstPointer) == t.charAt(secondPointer)) {
                firstPointer++;
            }

            secondPointer++;
        }

        return firstPointer == s.length();
    }

    public static void main(String[] args) {
        IsSubsequence checker = new IsSubsequence();

        System.out.println(checker.isSubsequence("abc", "ahbgdc"));
    }
}

