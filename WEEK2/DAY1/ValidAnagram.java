package WEEK2.DAY1;

    class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] letterBalance = new int[26];

        // count characters from first string
        for (int i = 0; i < s.length(); i++) {
            letterBalance[s.charAt(i) - 'a']++;
            letterBalance[t.charAt(i) - 'a']--;
        }

        // if all counts are zero, strings are anagrams
        for (int count : letterBalance) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String firstWord = "anagram";
        String secondWord = "nagaram";

        System.out.println(isAnagram(firstWord, secondWord));
    }
}

