package WEEK2.Day3;

public class FindIndexOfFirstOccurrence {

    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        for (int startPos = 0; startPos <= haystack.length() - needle.length(); startPos++) {

            int matchIndex = 0;

            while (matchIndex < needle.length()
                    && haystack.charAt(startPos + matchIndex) == needle.charAt(matchIndex)) {
                matchIndex++;
            }

            if (matchIndex == needle.length()) {
                return startPos;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FindIndexOfFirstOccurrence solver = new FindIndexOfFirstOccurrence();

        System.out.println(solver.strStr("sadbutsad", "sad"));
    }
}

