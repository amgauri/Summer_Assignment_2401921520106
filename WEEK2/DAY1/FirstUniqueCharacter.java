package WEEK2.DAY1;

    class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {

        int[] appearanceCount = new int[26];

        // store frequency of every character
        for (int i = 0; i < s.length(); i++) {
            appearanceCount[s.charAt(i) - 'a']++;
        }

        // find first character whose frequency is 1
        for (int index = 0; index < s.length(); index++) {
            if (appearanceCount[s.charAt(index) - 'a'] == 1) {
                return index;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String word = "leetcode";

        System.out.println(firstUniqChar(word));
    }
}

