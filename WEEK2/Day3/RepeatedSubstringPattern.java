package WEEK2.Day3;

public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String trimmed = doubled.substring(1, doubled.length() - 1);
        return trimmed.contains(s);
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern solver = new RepeatedSubstringPattern();

        System.out.println(solver.repeatedSubstringPattern("abab"));          // true
        System.out.println(solver.repeatedSubstringPattern("aba"));           // false
        System.out.println(solver.repeatedSubstringPattern("abcabcabcabc"));  // true
    }
}