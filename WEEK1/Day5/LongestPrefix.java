package WEEK1.Day5;

public class LongestPrefix {

    public static String longestCommonPrefix(String[] strs) {

        // Take first string as reference
        String prefix = strs[0];

        // Compare with remaining strings
        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {

                // Remove last character until prefix matches
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        String ans = longestCommonPrefix(strs);

        System.out.println(ans);
    }
} 

