package WEEK2.DAY1;

    class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] availableLetters = new int[26];

        // count letters available in magazine
        for (int i = 0; i < magazine.length(); i++) {
            availableLetters[magazine.charAt(i) - 'a']++;
        }

        // use letters for ransom note
        for (int i = 0; i < ransomNote.length(); i++) {
            int letterIndex = ransomNote.charAt(i) - 'a';

            if (availableLetters[letterIndex] == 0) {
                return false;
            }

            availableLetters[letterIndex]--;
        }

        return true;
    }

    public static void main(String[] args) {
        String noteText = "aa";
        String magazineText = "aab";

        System.out.println(canConstruct(noteText, magazineText));
    }
}

