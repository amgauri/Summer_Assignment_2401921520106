package WEEK2.Day3;

public class RepeatedSubstringPattern  {

    public boolean repeatedSubstringPattern(String s) {

        int totalLength = s.length();

        for (int pieceLength = 1; pieceLength <= totalLength / 2; pieceLength++) {

            if (totalLength % pieceLength != 0) {
                continue;
            }

            String candidate = s.substring(0, pieceLength);

            StringBuilder formedString = new StringBuilder();

            int repeatCount = totalLength / pieceLength;

            for (int turn = 0; turn < repeatCount; turn++) {
                formedString.append(candidate);
            }

            if (formedString.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern solver = new RepeatedSubstringPattern();

        System.out.println(solver.repeatedSubstringPattern("abab"));
    }
}

